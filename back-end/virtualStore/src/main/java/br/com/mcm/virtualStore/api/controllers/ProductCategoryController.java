package br.com.mcm.virtualStore.api.controllers;

import br.com.mcm.virtualStore.api.ProductCategoryAPI;
import br.com.mcm.virtualStore.category.entity.ProductCategory;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductCategoryController implements ProductCategoryAPI {
    @Override
    public Page<ProductCategory> listAll() {
        return null;
    }
}
