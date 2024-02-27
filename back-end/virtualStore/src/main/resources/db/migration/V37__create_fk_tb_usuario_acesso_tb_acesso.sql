ALTER TABLE tb_usuario_acesso
ADD CONSTRAINT fk_tb_usuario_acesso_tb_acesso
FOREIGN KEY (acesso_id)
REFERENCES tb_acesso(id);