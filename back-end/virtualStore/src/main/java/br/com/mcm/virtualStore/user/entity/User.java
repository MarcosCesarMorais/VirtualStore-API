package br.com.mcm.virtualStore.user.entity;

import br.com.mcm.virtualStore.user.dto.UserRequest;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.Instant;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "tb_usuario")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "data_atual_senha")
    private Instant currentDatePassword;

    @Column(name = "login")
    private String user;

    @Column(name = "senha")
    private String password;

    @NotNull(message = "'Status' cannot be null")
    @Column(name = "ativo")
    private boolean active;
    @Column(name = "data_criacao")
    private Instant createAt;

    @Column(name = "data_alteracao")
    private Instant updateAt;
    @Column(name = "usuario_geracao")
    private Long createUser;

    @Column(name = "usuario_alteracao")
    private Long updateUser;

    @ManyToMany(fetch = FetchType.LAZY, cascade = {
            CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinTable(name = "TB_USUARIO_ACESSO", joinColumns = @JoinColumn(name = "usuario_id"),
            inverseJoinColumns = @JoinColumn(name = "acesso_id"))
    private Set<Access> accessSet;

    public User() {
    }

    private User(
            final Long id,
            final Instant currentDatePassword,
            final String user,
            final String password,
            final boolean active,
            final Instant createAt,
            final Instant updateAt,
            final Long createUser,
            final Long updateUser
    ) {
        this.id = id;
        this.currentDatePassword = currentDatePassword;
        this.user = user;
        this.password = password;
        this.active = active;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.createUser = createUser;
        this.updateUser = updateUser;
    }

    private User(
            final Instant currentDatePassword,
            final String user,
            final String password,
            final boolean active,
            final Instant createAt,
            final Instant updateAt,
            final Long createUser,
            final Long updateUser
    ) {
        this.currentDatePassword = currentDatePassword;
        this.user = user;
        this.password = password;
        this.active = active;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.createUser = createUser;
        this.updateUser = updateUser;
    }

    public static User newUser(
            final String user,
            final String password,
            final Long createuser
    ) {
        var currentDatePassword = Instant.now();
        var updateUser = createuser;
        var createAt = Instant.now();
        var updateAt = Instant.now();
        var active = true;
        return new User(
                currentDatePassword,
                user,
                password,
                active,
                createAt,
                updateAt,
                createuser,
                updateUser
        );
    }

    public static User from(final User user) {
        return new User(
                user.getId(),
                user.getCurrentDatePassword(),
                user.getUser(),
                user.getPassword(),
                user.isActive(),
                user.getCreateAt(),
                user.getUpdateAt(),
                user.getCreateUser(),
                user.getUpdateUser()
        );
    }

    public static User with(
            final Long id,
            final Instant currentDatePassword,
            final String user,
            final String password,
            final boolean active,
            final Instant createAt,
            final Instant updateAt,
            final Long createUser,
            final Long updateUser
    ) {
        return new User(
                id,
                currentDatePassword,
                user,
                password,
                active,
                createAt,
                updateAt,
                createUser,
                updateUser
        );
    }

    public static User toEntity(UserRequest userRequest) {
        return new User();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getCurrentDatePassword() {
        return currentDatePassword;
    }

    public void setCurrentDatePassword(Instant currentDatePassword) {
        this.currentDatePassword = currentDatePassword;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public void setCreateAt(Instant createAt) {
        this.createAt = createAt;
    }

    public Instant getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Instant updateAt) {
        this.updateAt = updateAt;
    }

    public Long getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    public Long getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }

    public Set<Access> getAccessSet() {
        return accessSet;
    }

    public void setAccessSet(Set<Access> accessSet) {
        this.accessSet = accessSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
