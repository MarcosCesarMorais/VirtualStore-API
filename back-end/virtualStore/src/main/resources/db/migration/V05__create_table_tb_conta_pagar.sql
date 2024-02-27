CREATE SEQUENCE seq_tb_conta_pagar
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

CREATE TABLE tb_conta_pagar(
    id BIGINT DEFAULT NEXTVAL('seq_tb_conta_pagar') PRIMARY KEY,
    descricao VARCHAR(255) NOT NULL,
    data_pagamento DATE,
    data_vencimento DATE NOT NULL,
    status CHARACTER VARYING(255) NOT NULL,
    valor_desconto NUMERIC(19,2) NOT NULL,
    valor_total NUMERIC(19,2) NOT NULL,
    data_criacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    data_alteracao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    usuario_geracao INTEGER NOT NULL,
    usuario_alteracao INTEGER NOT NULL,
    pessoa_id BIGINT NOT NULL,
    pessoa_forn_id BIGINT NOT NULL
);