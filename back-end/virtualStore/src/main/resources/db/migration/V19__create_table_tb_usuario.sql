CREATE SEQUENCE seq_tb_usuario
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

CREATE TABLE tb_usuario (
    id BIGINT DEFAULT NEXTVAL('seq_tb_usuario') PRIMARY KEY,
    data_atual_senha TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    login VARCHAR(255) NOT NULL,
    senha VARCHAR(255) NOT NULL,
    data_criacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    data_alteracao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    usuario_geracao INTEGER NOT NULL,
    usuario_alteracao INTEGER NOT NULL,
    pessoa_id bigint NOT NULL
);