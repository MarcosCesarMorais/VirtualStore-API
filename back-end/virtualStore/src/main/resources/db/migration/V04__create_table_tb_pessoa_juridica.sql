CREATE SEQUENCE seq_tb_pessoa_juridica
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

CREATE TABLE tb_pessoa_juridica (
    id BIGINT DEFAULT NEXTVAL('seq_tb_pessoa_juridica'),
    email VARCHAR(255),
    nome VARCHAR(255) NOT NULL,
    telefone VARCHAR(20),
    categoria VARCHAR(255),
    cnpj VARCHAR(20) NOT NULL,
    insc_estadual VARCHAR(255) NOT NULL,
    insc_municipal VARCHAR(255),
    nome_fantasia VARCHAR(255) NOT NULL,
    razao_social VARCHAR(255) NOT NULL,
    CONSTRAINT tb_pessoa_juridica_pkey PRIMARY KEY (id)
);