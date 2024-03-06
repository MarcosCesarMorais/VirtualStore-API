CREATE SEQUENCE seq_tb_avaliacao_produto
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

CREATE TABLE tb_avaliacao_produto(
    id INTEGER DEFAULT NEXTVAL('seq_tb_avaliacao_produto'),
    descricao VARCHAR(255) NOT NULL,
    nota INTEGER NOT NULL,
    pessoa_id INTEGER NOT NULL,
    produto_id INTEGER NOT NULL,
    CONSTRAINT tb_avaliacao_produto_pkey PRIMARY KEY (id),
    FOREIGN KEY (produto_id) REFERENCES tb_produto(id)
);