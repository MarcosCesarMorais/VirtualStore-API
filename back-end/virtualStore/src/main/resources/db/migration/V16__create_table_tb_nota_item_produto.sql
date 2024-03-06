CREATE SEQUENCE seq_tb_nota_item_produto
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

CREATE TABLE tb_nota_item_produto (
    id INTEGER DEFAULT NEXTVAL('seq_tb_nota_item_produto'),
    quantidade double precision NOT NULL,
    nota_fiscal_compra_id INTEGER NOT NULL,
    produto_id INTEGER NOT NULL,
    CONSTRAINT tb_nota_item_produto_pkey PRIMARY KEY (id),
    FOREIGN KEY (nota_fiscal_compra_id) REFERENCES tb_nota_fiscal_compra(id)
);