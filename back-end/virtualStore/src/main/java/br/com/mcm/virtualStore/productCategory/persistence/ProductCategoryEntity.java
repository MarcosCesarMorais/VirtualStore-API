package br.com.mcm.virtualStore.productCategory.persistence;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
@Table(name = "tb_categoria_produto")
public class ProductCategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_tb_pessoa")
    private long id;
    @NotEmpty(message = "Descricao não pode estar vazio")
    @Size(min = 3, max = 100, message = "A descricao deve ter entre 3 e 100 caracteres")
    @Column(name = "descricao")
    private String description;

    public ProductCategoryEntity() {
    }

    private ProductCategoryEntity(
            final long id,
            final String description) {
        this.id = id;
        this.description = description;
    }

    public static ProductCategoryEntity from (
            final ProductCategoryEntity aProductCategory
    ){
        return new ProductCategoryEntity(
                aProductCategory.getId(),
                aProductCategory.getDescription()
        );
    }

    public static ProductCategoryEntity with (
            final long id,
            final String description
    ){
        return new ProductCategoryEntity(
                id,
                description
        );
    }

    public ProductCategoryEntity toEntity(){
        return ProductCategoryEntity.with(
                getId(),
                getDescription()
        );
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductCategoryEntity that = (ProductCategoryEntity) o;
        return id == that.id && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
