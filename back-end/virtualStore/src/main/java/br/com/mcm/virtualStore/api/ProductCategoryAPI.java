package br.com.mcm.virtualStore.api;

import br.com.mcm.virtualStore.ProductCategory.entity.ProductCategory;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "productCategories")
@Tag(name = "ProductCategory")
public interface ProductCategoryAPI {

    @GetMapping
    @Operation(summary = "List all product categories by pagination")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successfully listed"),
            @ApiResponse(responseCode = "422", description = "An invalid parameter was received"),
            @ApiResponse(responseCode = "422", description = "An internal server error was generated")
    })
    ProductCategory findById();
}
