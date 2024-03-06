CREATE SEQUENCE seq_tb_forma_pagamento
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

CREATE TABLE tb_forma_pagamento (
    id INTEGER DEFAULT NEXTVAL('seq_tb_forma_pagamento'),
    descricao VARCHAR(255) NOT NULL,
    CONSTRAINT tb_forma_pagamento_pkey PRIMARY KEY (id)
);

