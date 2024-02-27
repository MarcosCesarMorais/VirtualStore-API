CREATE SEQUENCE seq_tb_item_venda_loja
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

CREATE TABLE tb_item_venda_loja (
    id BIGINT DEFAULT NEXTVAL('seq_tb_item_venda_loja') PRIMARY KEY,
    quantidade double precision NOT NULL,
    produto_id bigint NOT NULL,
    data_criacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    data_alteracao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    usuario_geracao INTEGER NOT NULL,
    usuario_alteracao INTEGER NOT NULL,
    venda_compra_loja_virtual_id bigint NOT NULL
);
