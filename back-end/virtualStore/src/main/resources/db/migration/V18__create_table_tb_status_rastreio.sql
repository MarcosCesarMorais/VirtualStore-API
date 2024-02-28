CREATE SEQUENCE seq_tb_status_rastreio
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

CREATE TABLE tb_status_rastreio (
    id BIGINT DEFAULT NEXTVAL('seq_tb_status_rastreio') PRIMARY KEY,
    centro_distribuicao VARCHAR(255),
    cidade VARCHAR(255),
    estado VARCHAR(255),
    status VARCHAR(255),
    data_criacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    data_alteracao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    usuario_geracao INTEGER NOT NULL,
    usuario_alteracao INTEGER NOT NULL,
    venda_compra_loja_virtual_id bigint NOT NULL
);