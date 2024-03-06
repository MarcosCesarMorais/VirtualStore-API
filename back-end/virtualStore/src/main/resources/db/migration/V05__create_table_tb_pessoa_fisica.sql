CREATE SEQUENCE seq_tb_pessoa_fisica
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

CREATE TABLE tb_pessoa_fisica (
    id INTEGER DEFAULT NEXTVAL('seq_tb_pessoa_fisica'),
    email VARCHAR(255),
    nome VARCHAR(255) NOT NULL,
    telefone VARCHAR(20),
    cpf VARCHAR(20) NOT NULL,
    data_nascimento DATE,
    tipo_pessoa VARCHAR(100),
    CONSTRAINT tb_pessoa_fisica_pkey PRIMARY KEY (id)
);
