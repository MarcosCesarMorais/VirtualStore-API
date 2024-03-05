CREATE SEQUENCE seq_tb_nota_fiscal_venda
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

CREATE TABLE tb_nota_fiscal_venda (
    id BIGINT DEFAULT NEXTVAL('seq_tb_nota_fiscal_venda'),
    numero VARCHAR(100) NOT NULL,
    pdf text NOT NULL,
    serie VARCHAR(100) NOT NULL,
    tipo VARCHAR(100) NOT NULL,
    xml text NOT NULL,
    venda_compra_loja_virtual_id BIGINT NOT NULL,
    CONSTRAINT tb_nota_fiscal_venda PRIMARY KEY (id)
);