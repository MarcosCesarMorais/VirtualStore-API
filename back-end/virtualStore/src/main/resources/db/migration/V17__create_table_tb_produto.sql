CREATE SEQUENCE seq_tb_produto
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

CREATE TABLE tb_produto (
    id BIGINT DEFAULT NEXTVAL('seq_tb_produto') PRIMARY KEY,
    qtd_estoque INTEGER NOT NULL,
    qtde_alerta_estoque INTEGER,
    alerta_qtde_estoque BOOLEAN,
    altura double precision NOT NULL,
    ativo boolean NOT NULL,
    descricao text NOT NULL,
    largura double precision NOT NULL,
    link_youtube VARCHAR(255),
    nome VARCHAR(255) NOT NULL,
    peso double precision NOT NULL,
    profundidade double precision NOT NULL,
    qtde_clique INTEGER,
    tipo_unidade VARCHAR(255) NOT NULL,
    valor_venda NUMERIC(19,2) NOT NULL,
    data_criacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    data_alteracao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    usuario_geracao INTEGER NOT NULL,
    usuario_alteracao INTEGER NOT NULL
);