CREATE TABLE tb_usuario_acesso (
    usuario_id INTEGER NOT NULL,
    acesso_id INTEGER NOT NULL,
    foreign key (usuario_id) references tb_usuario(id),
    foreign key (acesso_id) references tb_acesso(id),
    primary key (usuario_id, acesso_id)
);