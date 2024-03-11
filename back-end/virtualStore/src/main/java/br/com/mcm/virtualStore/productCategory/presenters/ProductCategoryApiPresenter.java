package br.com.mcm.virtualStore.productCategory.presenters;

import br.com.mcm.virtualStore.productCategory.dto.ProductCategoryListResponse;
import br.com.mcm.virtualStore.productCategory.dto.ProductCategoryResponse;
import br.com.mcm.virtualStore.productCategory.persistence.ProductCategoryEntity;

public interface ProductCategoryApiPresenter {

    static ProductCategoryResponse present(final ProductCategoryEntity aProductCategory){
        return new ProductCategoryResponse(
                aProductCategory.getId(),
                aProductCategory.getDescription()
        );
    }

    static ProductCategoryListResponse presentList(final ProductCategoryEntity aProductCategory){
        return new ProductCategoryListResponse(
                aProductCategory.getId(),
                aProductCategory.getDescription()
        );
    }

}
