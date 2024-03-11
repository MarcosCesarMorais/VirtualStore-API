package br.com.mcm.virtualStore.productCategory.dto;

import java.time.Instant;

public record ProductCategoryListResponse(
        Long id,
        String description
) {
}
