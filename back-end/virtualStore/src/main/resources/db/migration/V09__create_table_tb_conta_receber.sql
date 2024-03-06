CREATE SEQUENCE seq_tb_conta_receber
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

CREATE TABLE tb_conta_receber(
    id INTEGER DEFAULT NEXTVAL('seq_tb_conta_receber'),
    descricao VARCHAR(255) NOT NULL,
    data_pagamento DATE,
    data_vencimento DATE NOT NULL,
    status VARCHAR(100) NOT NULL,
    valor_desconto NUMERIC(19,2) NOT NULL,
    valor_total NUMERIC(19,2) NOT NULL,
    pessoa_id INTEGER NOT NULL,
    CONSTRAINT tb_conta_receber_pkey PRIMARY KEY (id)
);