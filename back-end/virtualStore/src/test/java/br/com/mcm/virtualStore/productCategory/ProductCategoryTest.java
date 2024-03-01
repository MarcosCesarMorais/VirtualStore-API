package br.com.mcm.virtualStore.productCategory;

import br.com.mcm.virtualStore.productBrand.service.ProductBrandService;
import br.com.mcm.virtualStore.productCategory.repository.ProductCategoryRepository;
import br.com.mcm.virtualStore.productCategory.service.ProductCategoryService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class ProductCategoryTest {
    @InjectMocks
    private ProductCategoryService productCategoryService;

    @Mock
    private ProductCategoryRepository productCategoryRepository;




}
