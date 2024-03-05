package br.com.mcm.virtualStore.naturalPerson.entity;

import br.com.mcm.virtualStore.person.entity.Person;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "tb_pessoa_fisica")
@PrimaryKeyJoinColumn(name = "id")
public class NaturalPerson  extends Person {
    @Column(name = "numero_cpf")
    private String cpf;

    @Temporal(TemporalType.DATE)
    private Date dateBirth;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }
}
