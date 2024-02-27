ALTER TABLE tb_cupom_venda
ADD CONSTRAINT fk_tb_cupom_venda_tb_endereco_entrega
FOREIGN KEY (endereco_entrega_id)
REFERENCES tb_endereco(id);