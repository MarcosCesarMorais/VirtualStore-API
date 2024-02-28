package br.com.mcm.virtualStore.productCategory.repository;

import br.com.mcm.virtualStore.productCategory.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
