CREATE SEQUENCE seq_tb_produto
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

CREATE TABLE tb_produto (
    id BIGINT DEFAULT NEXTVAL('seq_tb_produto'),
    quantidade_estoque INTEGER NOT NULL,
    quantidade_alerta_estoque INTEGER,
    alerta_quantidade_estoque BOOLEAN,
    altura double precision NOT NULL,
    ativo boolean NOT NULL,
    descricao text NOT NULL,
    largura double precision NOT NULL,
    link_youtube VARCHAR(255),
    nome VARCHAR(255) NOT NULL,
    peso double precision NOT NULL,
    profundidade double precision NOT NULL,
    quantidade_clique INTEGER,
    tipo_unidade VARCHAR(255) NOT NULL,
    valor_venda NUMERIC(19,2) NOT NULL,
    CONSTRAINT tb_produto_pkey PRIMARY KEY (id)
);