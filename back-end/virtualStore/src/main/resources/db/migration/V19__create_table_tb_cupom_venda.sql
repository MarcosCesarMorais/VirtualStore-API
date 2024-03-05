CREATE SEQUENCE seq_tb_tb_cupom_venda
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

CREATE TABLE tb_cupom_venda (
    id BIGINT DEFAULT NEXTVAL('seq_tb_tb_cupom_venda'),
    data_entrega date NOT NULL,
    data_venda date NOT NULL,
    dia_entrega integer NOT NULL,
    valor_desconto numeric(19,2),
    valor_frete numeric(19,2) NOT NULL,
    valor_total numeric(19,2) NOT NULL,
    cupom_desconto_id bigint,
    endereco_cobranca_id bigint NOT NULL,
    endereco_entrega_id bigint NOT NULL,
    forma_pagamento_id bigint NOT NULL,
    nota_fiscal_venda_id bigint NOT NULL,
    pessoa_id bigint NOT NULL,
    CONSTRAINT tb_cupom_venda_pkey PRIMARY KEY (id)
);