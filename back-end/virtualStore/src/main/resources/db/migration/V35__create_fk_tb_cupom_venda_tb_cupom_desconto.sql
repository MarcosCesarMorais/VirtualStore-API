ALTER TABLE tb_cupom_venda
ADD CONSTRAINT fk_tb_cupom_venda_tb_cupom_desconto
FOREIGN KEY (cupom_desconto_id)
REFERENCES tb_cupom_desconto(id);