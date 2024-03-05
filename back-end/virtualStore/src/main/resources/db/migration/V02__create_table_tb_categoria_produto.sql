CREATE SEQUENCE seq_tb_categoria_produto
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

CREATE TABLE tb_categoria_produto(
    id BIGINT DEFAULT NEXTVAL('seq_tb_categoria_produto'),
    descricao VARCHAR(255),
    CONSTRAINT tb_categoria_produto_pkey PRIMARY KEY (id)
);