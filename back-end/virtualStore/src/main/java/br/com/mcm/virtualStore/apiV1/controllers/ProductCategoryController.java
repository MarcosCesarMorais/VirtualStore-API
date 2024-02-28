package br.com.mcm.virtualStore.apiV1.controllers;

import br.com.mcm.virtualStore.productBrand.dto.ProductBrandResponse;
import br.com.mcm.virtualStore.productCategory.dto.ProductCategoryListResponse;
import br.com.mcm.virtualStore.productCategory.dto.ProductCategoryRequest;
import br.com.mcm.virtualStore.productCategory.entity.ProductCategory;
import br.com.mcm.virtualStore.apiV1.ProductCategoryAPI;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductCategoryController implements ProductCategoryAPI {

    @Override
    public ProductBrandResponse getById(final Long id) {
        return null;
    }

    @Override
    public Page<ProductCategoryListResponse> listProductsCategories(String search, int page, int perPage, String sort, String direction) {
        return null;
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
