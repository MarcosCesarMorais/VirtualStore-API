CREATE SEQUENCE seq_tb_nota_item_produto
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

CREATE TABLE tb_nota_item_produto (
    id BIGINT DEFAULT NEXTVAL('seq_tb_nota_item_produto'),
    quantidade double precision NOT NULL,
    nota_fiscal_compra_id BIGINT NOT NULL,
    produto_id BIGINT NOT NULL,
    CONSTRAINT tb_nota_item_produto_pkey PRIMARY KEY (id)
);