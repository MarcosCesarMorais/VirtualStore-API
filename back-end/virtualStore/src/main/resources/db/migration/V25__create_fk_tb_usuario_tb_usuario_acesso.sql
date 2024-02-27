ALTER TABLE tb_usuario_acesso
ADD CONSTRAINT fk_tb_usuario_tb_usuario_acesso
FOREIGN KEY (usuario_id)
REFERENCES usuario(id);