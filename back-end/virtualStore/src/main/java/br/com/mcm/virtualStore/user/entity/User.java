package br.com.mcm.virtualStore.user.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_usuario")
public class User {
    @Id
    private Long id;




    id BIGINT DEFAULT NEXTVAL('seq_tb_usuario') PRIMARY KEY,
    data_atual_senha TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    login VARCHAR(255) NOT NULL,
    senha VARCHAR(255) NOT NULL,
    data_criacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    data_alteracao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    usuario_geracao INTEGER NOT NULL,
    usuario_alteracao INTEGER NOT NULL,
    pessoa_id bigint NOT NULL
}
