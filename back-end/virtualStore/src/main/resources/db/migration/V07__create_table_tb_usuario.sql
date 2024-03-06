CREATE SEQUENCE seq_tb_usuario
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

CREATE TABLE tb_usuario (
    id INTEGER DEFAULT NEXTVAL('seq_tb_usuario'),
    data_atual_senha DATE DEFAULT CURRENT_DATE,
    login VARCHAR(100) NOT NULL,
    senha VARCHAR(100) NOT NULL,
    pessoa_id bigint NOT NULL,
    CONSTRAINT tb_usuario_pkey PRIMARY KEY (id)
);