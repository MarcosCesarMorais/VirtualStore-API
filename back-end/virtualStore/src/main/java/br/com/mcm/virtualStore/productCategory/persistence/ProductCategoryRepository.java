package br.com.mcm.virtualStore.productCategory.persistence;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductCategoryRepository extends JpaRepository<ProductCategoryEntity, Long> {

    Page<ProductCategoryEntity> findAll(Specification<ProductCategoryEntity> whereClause, Pageable page);

    @Query(value = "select c.id from ProductCategoryEntity c where c.id in :ids")
    List<Long> existsByIds(@Param("ids") List<Long> ids);
}
