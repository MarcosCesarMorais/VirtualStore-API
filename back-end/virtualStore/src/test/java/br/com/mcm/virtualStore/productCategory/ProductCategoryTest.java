package br.com.mcm.virtualStore.productCategory;

import br.com.mcm.virtualStore.productCategory.persistence.ProductCategoryRepository;
import br.com.mcm.virtualStore.productCategory.service.ProductCategoryService;
import org.junit.jupiter.api.extension.ExtendWith;
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
