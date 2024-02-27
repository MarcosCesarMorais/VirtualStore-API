ALTER TABLE tb_avaliacao_produto
ADD CONSTRAINT fk_tb_avaliacao_produto_tb_produto
FOREIGN KEY (produto_id)
REFERENCES tb_produto(id);