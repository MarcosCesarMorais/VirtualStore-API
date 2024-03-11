package br.com.mcm.virtualStore.productCategory.service;

import br.com.mcm.virtualStore.pagination.Pagination;
import br.com.mcm.virtualStore.pagination.SearchQuery;
import br.com.mcm.virtualStore.productCategory.persistence.ProductCategoryEntity;
import br.com.mcm.virtualStore.productCategory.persistence.ProductCategoryRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static org.hibernate.criterion.Restrictions.like;

@Service
public class ProductCategoryService {

    private ProductCategoryRepository repository;

    public ProductCategoryService(ProductCategoryRepository repository) {
        this.repository = repository;
    }

    public Pagination<ProductCategoryEntity> findAll(final SearchQuery aQuery) {
        // Paginação
        final var page = PageRequest.of(
                aQuery.page(),
                aQuery.perPage(),
                Sort.by(Sort.Direction.fromString(aQuery.direction()), aQuery.sort())
        );

        // Busca dinamica pelo criterio terms (name ou description)
        final var specifications = Optional.ofNullable(aQuery.terms())
                .filter(str -> !str.isBlank())
                .map(this::assembleSpecification)
                .orElse(null);

        final var pageResult =
                this.repository.findAll(Specification.where(specifications), page);

        return new Pagination<>(
                pageResult.getNumber(),
                pageResult.getSize(),
                pageResult.getTotalElements(),
                pageResult.map(ProductCategoryEntity::toEntity).toList()
        );
    }
    private ProductCategoryEntity save(final ProductCategoryEntity aProductCategory) {
        return this.repository.save(ProductCategoryEntity.from(aProductCategory)).toEntity();
    }

    private Specification<ProductCategoryEntity> assembleSpecification(final String str) {
        final Specification<ProductCategoryEntity> descriptionLike = (Specification<ProductCategoryEntity>) like("description", str);
        return descriptionLike;
    }
}
