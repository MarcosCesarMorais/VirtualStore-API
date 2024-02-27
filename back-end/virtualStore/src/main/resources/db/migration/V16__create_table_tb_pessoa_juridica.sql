CREATE SEQUENCE seq_tb_pessoa_juridica
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

CREATE TABLE tb_pessoa_juridica (
    id BIGINT DEFAULT NEXTVAL('seq_tb_pessoa_juridica') PRIMARY KEY,
    email VARCHAR(255) NOT NULL,
    nome VARCHAR(255) NOT NULL,
    telefone VARCHAR(20) NOT NULL,
    categoria VARCHAR(255),
    cnpj VARCHAR(20) NOT NULL,
    insc_estadual VARCHAR(255) NOT NULL,
    insc_municipal VARCHAR(255),
    nome_fantasia VARCHAR(255) NOT NULL,
    razao_social VARCHAR(255) NOT NULL,
    data_criacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    data_alteracao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    usuario_geracao INTEGER NOT NULL,
    usuario_alteracao INTEGER NOT NULL
);