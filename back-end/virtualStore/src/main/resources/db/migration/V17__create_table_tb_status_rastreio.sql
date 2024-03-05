CREATE SEQUENCE seq_tb_status_rastreio
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

CREATE TABLE tb_status_rastreio (
    id BIGINT DEFAULT NEXTVAL('seq_tb_status_rastreio'),
    centro_distribuicao VARCHAR(100),
    cidade VARCHAR(100),
    estado VARCHAR(100),
    status VARCHAR(20),
    venda_compra_loja_virtual_id bigint NOT NULL,
    CONSTRAINT tb_status_rastreio_pkey PRIMARY KEY (id)
);