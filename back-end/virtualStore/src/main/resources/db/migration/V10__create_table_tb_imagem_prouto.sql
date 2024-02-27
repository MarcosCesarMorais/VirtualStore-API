CREATE SEQUENCE seq_tb_imagem_produto
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

CREATE TABLE tb_imagem_produto (
    id BIGINT DEFAULT NEXTVAL('seq_tb_imagem_produto') PRIMARY KEY,
    imagem_miniatura text NOT NULL,
    imagem_original text NOT NULL,
    data_criacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    data_alteracao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    usuario_geracao INTEGER NOT NULL,
    usuario_alteracao INTEGER NOT NULL,
    produto_id bigint NOT NULL
);