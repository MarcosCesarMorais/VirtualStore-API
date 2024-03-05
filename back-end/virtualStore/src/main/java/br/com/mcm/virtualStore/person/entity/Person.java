package br.com.mcm.virtualStore.person.entity;

import javax.persistence.*;

@Entity
@Table(name = "tb_pessoa")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@SequenceGenerator(name = "seq_tb_pessoa", sequenceName = "seq_tb_pessoa",
    initialValue = 1, allocationSize = 1)
public abstract class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_tb_pessoa")
    private Long id;

    @Column(name = "nome")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "telefone")
    private String telephone;
}
