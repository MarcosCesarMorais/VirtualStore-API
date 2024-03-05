package br.com.mcm.virtualStore.access.entity;

import br.com.mcm.virtualStore.user.entity.User;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.Instant;
import java.util.Objects;
import java.util.Set;
@Entity
@Table(name = "tb_acesso")
public class Access {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull(message = "'Name' cannot be null")
    @Column(name = "nome")
    private String name;

    @NotNull(message = "'Update access' cannot be null")
    @Column(name = "data_alteracao")
    private Instant updateAt;
    @ManyToMany(fetch = FetchType.LAZY, cascade = {
            CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinTable(name = "TB_USUARIO_ACESSO", joinColumns = @JoinColumn(name = "acesso_id"),
            inverseJoinColumns = @JoinColumn(name = "usuario_id"))
    private Set<User> users;

    public Access() {
    }

    private Access(
            final Long id,
            final String name,
            final Instant updateAt
    ) {
        this.id = id;
        this.name = name;
        this.updateAt = updateAt;
    }

    private Access(
            final String name,
            final Instant updateAt
    ) {
        this.name = name;
        this.updateAt = updateAt;
    }

    public static Access newAccess(final String name) {
        var updateAt = Instant.now();
        return new Access(name, updateAt);
    }

    public static Access from(
            final Long id,
            final String name,
            final Instant updateAt
    ) {
        return new Access(id, name, updateAt);
    }

    public static Access with(Access access) {
        return new Access(
                access.getId(),
                access.getName(),
                access.getUpdateAt());
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

    public Instant getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Instant updateAt) {
        this.updateAt = updateAt;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Access access = (Access) o;
        return Objects.equals(id, access.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
