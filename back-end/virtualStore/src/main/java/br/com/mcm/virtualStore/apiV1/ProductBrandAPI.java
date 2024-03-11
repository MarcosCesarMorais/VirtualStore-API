package br.com.mcm.virtualStore.apiV1;

import br.com.mcm.virtualStore.productBrand.dto.ProductBrandListResponse;
import br.com.mcm.virtualStore.productBrand.dto.ProductBrandResponse;
import br.com.mcm.virtualStore.productBrand.dto.ProductBransRequest;
import br.com.mcm.virtualStore.productBrand.entity.ProductBrand;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "productsbrands")
@Tag(name = "ProductBrand")
public interface ProductBrandAPI {

    @GetMapping(
            value = "{id}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @Operation(summary = "Get a product brand by it's identifier")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Product brand retrieved successfully"),
            @ApiResponse(responseCode = "404", description = "Product brand was not found"),
            @ApiResponse(responseCode = "500", description = "An internal server error was generated")
    })
    ProductBrandResponse getById(@PathVariable( name = "id") Long id);

    @GetMapping
    @Operation(summary = "List all products brands paginated")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Listed successfully"),
            @ApiResponse(responseCode = "422", description = "A invalid parameter was received"),
            @ApiResponse(responseCode = "500", description = "An internal server error was thrown"),
    })
    Page<ProductBrandListResponse> listProductsBrands(
            @RequestParam(name = "search", required = false, defaultValue = "") final String search,
            @RequestParam(name = "page", required = false, defaultValue = "0") final int page,
            @RequestParam(name = "perPage", required = false, defaultValue = "10") final int perPage,
            @RequestParam(name = "sort", required = false, defaultValue = "name") final String sort,
            @RequestParam(name = "dir", required = false, defaultValue = "asc") final String direction
    );

    @PutMapping(
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @Operation(summary = "Update a product brand by it's identifier")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Brand updated successfully"),
            @ApiResponse(responseCode = "404", description = "Category was not found"),
            @ApiResponse(responseCode = "500", description = "An internal server error was thrown")
    })
    ResponseEntity<?> update (@RequestBody ProductBransRequest request);

    @PostMapping(
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @Operation(summary = "Create a new product brand")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Created successfully"),
            @ApiResponse(responseCode = "422", description = "A validation error was thrown"),
            @ApiResponse(responseCode = "500", description = "An internal server error was thrown"),
    })
    ResponseEntity<?> createProductBrand(@RequestBody ProductBransRequest request);

    @DeleteMapping(value = "{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @Operation(summary = "Delete a product brand by it's identifier")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204", description = "Product brand deleted successfully"),
            @ApiResponse(responseCode = "404", description = "Product brand was not found"),
            @ApiResponse(responseCode = "500", description = "An internal server error was thrown"),
    })
    void deleteById(@PathVariable(name = "id") Long id);

}
