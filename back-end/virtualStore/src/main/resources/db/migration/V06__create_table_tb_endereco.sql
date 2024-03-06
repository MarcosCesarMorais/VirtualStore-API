CREATE SEQUENCE seq_tb_endereco
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

CREATE TABLE tb_endereco (
    id INTEGER DEFAULT NEXTVAL('seq_tb_endereco'),
    bairro VARCHAR (255) NOT NULL,
    cep VARCHAR (9) NOT NULL,
    cidade VARCHAR (255) NOT NULL,
    complemento VARCHAR (255),
    numero VARCHAR (20) NOT NULL,
    logradouro VARCHAR (255) NOT NULL,
    tipo_endereco VARCHAR (255) NOT NULL,
    uf VARCHAR (2) NOT NULL,
    pessoa_id BIGINT NOT NULL,
    CONSTRAINT tb_endereco_pkey PRIMARY KEY (id)
);