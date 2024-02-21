package br.com.mcm.virtualStore.category.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name="tb_categoria_produto")
public class ProductCategory {

    @Id
    private Long id;
    @NotEmpty(message="Nome não pode estar vazio")
    @Size(min = 3, max = 100, message = "O nome deve ter entre 3 e 100 caracteres")
    @Column(name="nome")
    private String name;
    @Column(name="ativo")
    private boolean active;
    @Column(name="data_criacao")
    private Instant creationDate;
    @Column(name="data_alteracao")
    private Instant changeDate;
    public ProductCategory(){}
    private ProductCategory (
            final Long id,
            final String name,
            final boolean active,
            final Instant creationDate,
            final Instant changeDate
    ){
      this.id = id;
      this.name = name;
      this.active = active;
      this.creationDate = creationDate;
      this.changeDate = changeDate;
    }

    public ProductCategory newProductCategory(
            final String name
    ){
        var active = true;
        var creationDate = Instant.now();
        return new ProductCategory();
    }

    public ProductCategory with (
            final Long id,
            final String name,
            final boolean active
    ){
        var changeDate = Instant.now();
        return new ProductCategory();
    }

    public ProductCategory from (final ProductCategory productCategory){
        return new ProductCategory(
                productCategory.getId(),
                productCategory.getName(),
                productCategory.isActive(),
                productCategory.getCreationDate(),
                productCategory.getChangeDate()
        );
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Instant getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Instant creationDate) {
        this.creationDate = creationDate;
    }

    public Instant getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(Instant changeDate) {
        this.changeDate = changeDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductCategory that = (ProductCategory) o;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
