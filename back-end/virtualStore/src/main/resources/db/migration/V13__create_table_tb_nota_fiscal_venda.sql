CREATE SEQUENCE seq_tb_nota_fiscal_venda
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

CREATE TABLE tb_nota_fiscal_venda (
    id BIGINT DEFAULT NEXTVAL('seq_tb_nota_fiscal_venda') PRIMARY KEY,
    numero VARCHAR(255) NOT NULL,
    pdf text NOT NULL,
    serie VARCHAR(255) NOT NULL,
    tipo VARCHAR(255) NOT NULL,
    xml text NOT NULL,
    data_criacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    data_alteracao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    usuario_geracao INTEGER NOT NULL,
    usuario_alteracao INTEGER NOT NULL,
    venda_compra_loja_virtual_id BIGINT NOT NULL
);