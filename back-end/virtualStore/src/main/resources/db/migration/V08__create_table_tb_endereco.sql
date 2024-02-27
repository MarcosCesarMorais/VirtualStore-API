CREATE SEQUENCE seq_tb_endereco
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

CREATE TABLE tb_endereco (
    id BIGINT DEFAULT NEXTVAL('seq_tb_endereco') PRIMARY KEY,
    bairro VARCHAR (255) NOT NULL,
    cep VARCHAR (9) NOT NULL,
    cidade VARCHAR (255) NOT NULL,
    complemento VARCHAR (255),
    numero VARCHAR (20) NOT NULL,
    logradouro VARCHAR (255) NOT NULL,
    tipo_endereco VARCHAR (255) NOT NULL,
    uf VARCHAR (2) NOT NULL,
    data_criacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    data_alteracao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    usuario_geracao INTEGER NOT NULL,
    usuario_alteracao INTEGER NOT NULL,
    pessoa_id BIGINT NOT NULL
);