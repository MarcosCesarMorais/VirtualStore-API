package br.com.mcm.virtualStore.productCategory.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
@Table(name = "tb_categoria_produto")
public class ProductCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_tb_pessoa")
    private long id;
    @NotEmpty(message = "Nome não pode estar vazio")
    @Size(min = 3, max = 100, message = "O nome deve ter entre 3 e 100 caracteres")
    @Column(name = "descricao")
    private String description;

    public ProductCategory() {
    }

    private ProductCategory(
            final long id,
            final String description) {
        this.id = id;
        this.description = description;
    }

    public static ProductCategory from (
            final ProductCategory aProductCategory
    ){
        return new ProductCategory(
                aProductCategory.getId(),
                aProductCategory.getDescription()
        );
    }

    public static ProductCategory with (
            final long id,
            final String description
    ){
        return new ProductCategory(
                id,
                description
        );
    }

    public ProductCategory toEntity(){
        return ProductCategory.with(
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
        ProductCategory that = (ProductCategory) o;
        return id == that.id && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
