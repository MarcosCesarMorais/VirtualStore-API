package br.com.mcm.virtualStore.productBrand.repository;

import br.com.mcm.virtualStore.productBrand.entity.ProductBrand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductBrandRepository extends JpaRepository<ProductBrand, Long> {
}
