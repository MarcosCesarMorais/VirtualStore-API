CREATE SEQUENCE seq_tb_tb_cupom_venda
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

CREATE SEQUENCE seq_tb_nota_fiscal_venda
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

CREATE TABLE tb_nota_fiscal_venda (
    id INTEGER DEFAULT NEXTVAL('seq_tb_nota_fiscal_venda'),
    numero VARCHAR(100) NOT NULL,
    pdf text NOT NULL,
    serie VARCHAR(100) NOT NULL,
    tipo VARCHAR(100) NOT NULL,
    xml text NOT NULL,
    venda_compra_loja_virtual_id INTEGER NOT NULL,
    CONSTRAINT tb_nota_fiscal_venda_pk PRIMARY KEY (id)
);

CREATE TABLE tb_venda_cupom (
    id INTEGER DEFAULT NEXTVAL('seq_tb_tb_cupom_venda'),
    data_entrega DATE NOT NULL,
    data_venda DATE NOT NULL,
    dia_entrega INTEGER NOT NULL,
    valor_desconto NUMERIC(19,2),
    valor_frete NUMERIC(19,2) NOT NULL,
    valor_total NUMERIC(19,2) NOT NULL,
    cupom_desconto_id bigint,
    endereco_cobranca_id bigint NOT NULL,
    endereco_entrega_id bigint NOT NULL,
    forma_pagamento_id bigint NOT NULL,
    nota_fiscal_venda_id bigint NOT NULL,
    pessoa_id bigint NOT NULL,
    CONSTRAINT tb_cupom_venda_pkey PRIMARY KEY (id),
    FOREIGN KEY (cupom_desconto_id) REFERENCES tb_cupom_desconto(id),
    FOREIGN KEY (endereco_cobranca_id) REFERENCES tb_endereco(id),
    FOREIGN KEY (endereco_entrega_id) REFERENCES tb_endereco(id),
    FOREIGN KEY (forma_pagamento_id) REFERENCES tb_forma_pagamento(id),
    FOREIGN KEY (nota_fiscal_venda_id) REFERENCES tb_nota_fiscal_venda(id)
);

ALTER TABLE tb_nota_fiscal_venda
ADD CONSTRAINT tb_nota_fiscal_venda_venda_compra_loja_virtual_id_fkey
FOREIGN KEY (venda_compra_loja_virtual_id)
REFERENCES tb_venda_cupom(id);


