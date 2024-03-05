CREATE SEQUENCE seq_tb_imagem_produto
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

CREATE TABLE tb_imagem_produto (
    id BIGINT DEFAULT NEXTVAL('seq_tb_imagem_produto'),
    imagem_miniatura text NOT NULL,
    imagem_original text NOT NULL,
    produto_id bigint NOT NULL,
    CONSTRAINT tb_imagem_produto_pkey PRIMARY KEY (id)
);