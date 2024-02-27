package br.com.mcm.virtualStore.api.controllers;

import br.com.mcm.virtualStore.ProductCategory.entity.ProductCategory;
import br.com.mcm.virtualStore.api.ProductCategoryAPI;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductCategoryController implements ProductCategoryAPI {

    @Override
    public ProductCategory findById() {
        return null;
    }
}
