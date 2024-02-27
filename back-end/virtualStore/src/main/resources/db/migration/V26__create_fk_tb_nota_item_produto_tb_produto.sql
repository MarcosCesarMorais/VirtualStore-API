ALTER TABLE tb_nota_item_produto
ADD CONSTRAINT fk_tb_produto_tb_nota_item_produto
FOREIGN KEY (produto_id)
REFERENCES tb_produto(id);