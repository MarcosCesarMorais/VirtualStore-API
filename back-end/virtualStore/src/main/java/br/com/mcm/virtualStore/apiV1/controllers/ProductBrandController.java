package br.com.mcm.virtualStore.apiV1.controllers;

import br.com.mcm.virtualStore.apiV1.ProductBrandAPI;
import br.com.mcm.virtualStore.productBrand.dto.ProductBrandListResponse;
import br.com.mcm.virtualStore.productBrand.dto.ProductBrandResponse;
import br.com.mcm.virtualStore.productBrand.dto.ProductBransRequest;
import br.com.mcm.virtualStore.productBrand.service.ProductBrandService;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class ProductBrandController implements ProductBrandAPI {
    private ProductBrandService aProductBrandService;

    public ProductBrandController (ProductBrandService aProductBrandService){
        this.aProductBrandService = Objects.requireNonNull(aProductBrandService);
    }

    @Override
    public ProductBrandResponse getById(final Long id) {
        return null;
    }

    @Override
    public Page<ProductBrandListResponse> listProductsBrands(String search, int page, int perPage, String sort, String direction) {
        return null;
    }

    @Override
    public ResponseEntity<?> update(final ProductBransRequest request) {
        return null;
    }

    @Override
    public ResponseEntity<?> createProductBrand(final ProductBransRequest request) {
        return null;
    }

    @Override
    public void deleteById(final Long id) {

    }
}
