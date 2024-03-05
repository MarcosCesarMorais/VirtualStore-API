CREATE SEQUENCE seq_tb_usuario
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

CREATE TABLE tb_usuario (
    id BIGINT DEFAULT NEXTVAL('seq_tb_usuario'),
    data_atual_senha TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    login VARCHAR(100) NOT NULL,
    senha VARCHAR(100) NOT NULL,
    pessoa_id bigint NOT NULL,
    CONSTRAINT tb_usuario_pkey PRIMARY KEY (id)
);