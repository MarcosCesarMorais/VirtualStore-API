package br.com.mcm.virtualStore.access.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
@Table(name = "tb_acesso")
public class UserAccess {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull(message = "'Description' cannot be null")
    @Column(name = "descricao")
    private String description;

    public UserAccess() {
    }

    private UserAccess(
            final Long id,
            final String description
    ) {
        this.id = id;
        this.description = description;
    }

    private UserAccess(
            final String description
    ) {
        this.description = description;
    }

    public static UserAccess newAccess(final String description) {
        return new UserAccess(description);
    }

    public static UserAccess from(
            final Long id,
            final String description
    ) {
        return new UserAccess(id, description);
    }

    public static UserAccess with(UserAccess access) {
        return new UserAccess(
                access.getId(),
                access.getDescription()
        );
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
        UserAccess access = (UserAccess) o;
        return Objects.equals(id, access.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
