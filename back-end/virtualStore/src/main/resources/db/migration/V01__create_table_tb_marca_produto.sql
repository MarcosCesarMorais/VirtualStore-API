CREATE SEQUENCE seq_tb_marca_produto
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

CREATE TABLE tb_marca_produto(
    id BIGINT DEFAULT NEXTVAL('seq_tb_marca_produto'),
    descricao VARCHAR(255),
    ativo BOOLEAN NOT NULL DEFAULT TRUE,
    CONSTRAINT tb_marca_produto_pkey PRIMARY KEY (id)
);