package br.com.mcm.virtualStore.ProductCategory.repository;

import br.com.mcm.virtualStore.ProductCategory.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
