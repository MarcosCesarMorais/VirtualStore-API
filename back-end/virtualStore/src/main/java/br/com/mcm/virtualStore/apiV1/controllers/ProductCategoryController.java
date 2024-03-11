package br.com.mcm.virtualStore.apiV1.controllers;

import br.com.mcm.virtualStore.pagination.Pagination;
import br.com.mcm.virtualStore.pagination.SearchQuery;
import br.com.mcm.virtualStore.productBrand.dto.ProductBrandResponse;
import br.com.mcm.virtualStore.productCategory.dto.ProductCategoryListResponse;
import br.com.mcm.virtualStore.productCategory.dto.ProductCategoryRequest;
import br.com.mcm.virtualStore.apiV1.ProductCategoryAPI;

import br.com.mcm.virtualStore.productCategory.dto.ProductCategoryResponse;
import br.com.mcm.virtualStore.productCategory.presenters.ProductCategoryApiPresenter;
import br.com.mcm.virtualStore.productCategory.service.ProductCategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductCategoryController implements ProductCategoryAPI {

    private ProductCategoryService service;

    public ProductCategoryController(ProductCategoryService service) {
        this.service = service;
    }

    @Override
    public ProductBrandResponse getById(final Long id) {
        return null;
    }

    @Override
    public Pagination<ProductCategoryListResponse> listProductsCategories(
            final String search,
            final int page,
            final int perPage,
            final String sort,
            final String direction
    ) {
        return service.findAll(new SearchQuery(page, perPage, search, sort, direction))
                .map(ProductCategoryApiPresenter::presentList);
    }

    @Override
    public ResponseEntity<?> update(final ProductCategoryRequest request) {
        return null;
    }

    @Override
    public ResponseEntity<?> createProductCategory(final ProductCategoryRequest request) {
        return null;
    }

    @Override
    public void deleteById(final Long id) {

    }
}
