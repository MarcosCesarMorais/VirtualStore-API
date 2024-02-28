package br.com.mcm.virtualStore.productBrand.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import java.time.Instant;
import java.util.Objects;
@Entity
public class ProductBrand {
    @Id
    private Long id;
    @NotNull(message = "'Name' cannot be null")
    @Size(min = 3, max = 100, message = "'Name' must be between 3 and 100 characters")
    @Column(name="nome")
    private String name;
    @NotNull(message = "'Status' cannot be null")
    @Column(name="ativo")
    private boolean active;
    @NotNull(message = "'Creation date' cannot be null")
    @Column(name="data_criacao")
    private Instant createAt;
    @NotNull(message = "'Update date' cannot be null")
    @Column(name="data_alteracao")
    private Instant updateAt;
    @NotNull(message = "'Creation user' cannot be null")
    @Column(name="usuario_geracao")
    private Integer createUser;
    @NotNull(message = "'Update user' cannot be null")
    @Column(name="usuario_alteracao")
    private Integer updateUser;

    public ProductBrand(){};

    private ProductBrand(
            String name,
            boolean active,
            Instant createAt,
            Instant updateAt,
            Integer createUser,
            Integer updateUser
    ) {
        this.name = name;
        this.active = active;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.createUser = createUser;
        this.updateUser = updateUser;

    }

    private ProductBrand(
            Long id,
            String name,
            boolean active,
            Instant createAt,
            Instant updateAt,
            Integer createUser,
            Integer updateUser
    ) {
        this.id = id;
        this.name = name;
        this.active = active;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.createUser = createUser;
        this.updateUser = updateUser;
    }

    public static ProductBrand newProductBrand(
        final String name,
        final Integer createUser
    ){
        var active = true;
        var createAt = Instant.now();
        var updateAt = Instant.now();
        var updateUser = createUser;

        return new ProductBrand(
            name,
            active,
            createAt,
            updateAt,
            createUser,
            updateUser
        );
    }
    public static ProductBrand from (final ProductBrand aProductBrand){
        return new ProductBrand(
                aProductBrand.getId(),
                aProductBrand.getName(),
                aProductBrand.isActive(),
                aProductBrand.getCreateAt(),
                aProductBrand.getUpdateAt(),
                aProductBrand.getCreateUser(),
                aProductBrand.getUpdateUser()
        );
    }
    public static ProductBrand with (
            final long id,
            final String name,
            final boolean active,
            final Instant createAt,
            final Instant updateAt,
            final Integer createUser,
            final Integer updateUser
    ){
        return new ProductBrand(
                id,
                name,
                active,
                createAt,
                updateAt,
                createUser,
                updateUser
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

    public Instant getCreateAt() {
        return createAt;
    }

    public void setCreate_at(Instant create_at) {
        this.createAt = createAt;
    }

    public Instant getUpdateAt() {
        return updateAt;
    }

    public void setUpdate_at(Instant updateAt) {
        this.updateAt = updateAt;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Integer getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductBrand that = (ProductBrand) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
