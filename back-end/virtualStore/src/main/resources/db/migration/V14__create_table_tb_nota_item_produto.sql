CREATE SEQUENCE seq_tb_nota_item_produto
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

CREATE TABLE tb_nota_item_produto (
    id BIGINT DEFAULT NEXTVAL('seq_tb_nota_item_produto') PRIMARY KEY,
    quantidade double precision NOT NULL,
    data_criacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    data_alteracao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    usuario_geracao INTEGER NOT NULL,
    usuario_alteracao INTEGER NOT NULL,
    nota_fiscal_compra_id BIGINT NOT NULL,
    produto_id BIGINT NOT NULL
);