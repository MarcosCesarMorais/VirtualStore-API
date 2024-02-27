ALTER TABLE tb_item_venda_loja
ADD CONSTRAINT fk_tb_item_venda_loja_tb_produto
FOREIGN KEY (produto_id)
REFERENCES tb_produto(id);