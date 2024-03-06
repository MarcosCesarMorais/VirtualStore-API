package br.com.mcm.virtualStore.user.entity;

import br.com.mcm.virtualStore.access.entity.UserAccess;
import br.com.mcm.virtualStore.user.dto.UserRequest;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.Instant;
import java.util.List;
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

    @Column(name = "pessoa_id")
    private Long personId;

    @OneToMany(
            fetch = FetchType.LAZY, cascade = {
            CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinTable(
            name = "tb_usuario_acesso",
            joinColumns = @JoinColumn(name = "usuario_id"),
            inverseJoinColumns = @JoinColumn(name = "acesso_id")
    )
    private List<UserAccess> accessList;

    public User() {
    }

    private User(
            final Long id,
            final Instant currentDatePassword,
            final String user,
            final String password,
            final Long personId
    ) {
        this.id = id;
        this.currentDatePassword = currentDatePassword;
        this.user = user;
        this.password = password;
        this.personId = personId;
    }

    private User(
            final Instant currentDatePassword,
            final String user,
            final String password,
            final Long personId
    ) {
        this.currentDatePassword = currentDatePassword;
        this.user = user;
        this.password = password;
        this.personId = personId;
    }

    public static User newUser(
            final String user,
            final String password,
            final Long personId
    ) {
        var currentDatePassword = Instant.now();
        return new User(
                currentDatePassword,
                user,
                password,
                personId
        );
    }

    public static User from(final User user) {
        return new User(
                user.getId(),
                user.getCurrentDatePassword(),
                user.getUser(),
                user.getPassword(),
                user.getPersonId()
        );
    }

    public static User with(
            final Long id,
            final Instant currentDatePassword,
            final String user,
            final String password,
            final Long personId
    ) {
        return new User(
                id,
                currentDatePassword,
                user,
                password,
                personId
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

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public List<UserAccess> getAccessList() {
        return accessList;
    }

    public void setAccessList(List<UserAccess> accessList) {
        this.accessList = accessList;
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
