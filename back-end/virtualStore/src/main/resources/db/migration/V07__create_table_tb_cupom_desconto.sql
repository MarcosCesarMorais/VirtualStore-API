CREATE SEQUENCE seq_tb_cupom_desconto
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

CREATE TABLE tb_cupom_desconto (
    id BIGINT DEFAULT NEXTVAL('seq_tb_cupom_desconto') PRIMARY KEY,
    codigo_desconto VARCHAR(255) NOT NULL,
    data_validade_cupom DATE NOT NULL,
    valor_porcentual_desconto NUMERIC(19,2),
    valor_real_desconto NUMERIC(19,2),
    data_criacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    data_alteracao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    usuario_geracao INTEGER NOT NULL,
    usuario_alteracao INTEGER NOT NULL
);