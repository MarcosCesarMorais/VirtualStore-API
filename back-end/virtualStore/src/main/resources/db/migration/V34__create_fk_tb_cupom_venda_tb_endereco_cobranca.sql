ALTER TABLE tb_cupom_venda
ADD CONSTRAINT fk_tb_cupom_venda_tb_endereco_cobranca
FOREIGN KEY (endereco_cobranca_id)
REFERENCES tb_endereco(id);