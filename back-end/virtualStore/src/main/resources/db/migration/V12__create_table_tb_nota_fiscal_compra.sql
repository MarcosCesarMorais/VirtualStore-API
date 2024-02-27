CREATE SEQUENCE seq_tb_nota_fiscal_compra
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

CREATE TABLE tb_nota_fiscal_compra (
    id INTEGER DEFAULT NEXTVAL('seq_tb_nota_fiscal_compra') PRIMARY KEY,
    data_compra TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    descricao_obs VARCHAR(255),
    numero_nota VARCHAR (255) NOT NULL,
    serie_nota VARCHAR (255) NOT NULL,
    valor_desconto NUMERIC(19,2),
    valor_icms NUMERIC(19,2) NOT NULL,
    valor_total NUMERIC(19,2) NOT NULL,
    data_criacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    data_alteracao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    usuario_geracao INTEGER NOT NULL,
    usuario_alteracao INTEGER NOT NULL,
    conta_pagar_id INTEGER NOT NULL,
    pessoa_id INTEGER NOT NULL
);