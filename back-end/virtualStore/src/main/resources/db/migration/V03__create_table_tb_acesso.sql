CREATE SEQUENCE seq_tb_acesso
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

CREATE TABLE tb_acesso(
    id BIGINT DEFAULT NEXTVAL('seq_tb_acesso'),
    descricao VARCHAR(255) NOT NULL,
    CONSTRAINT tb_acesso_pkey PRIMARY KEY (id)
);