ALTER TABLE tb_status_rastreio
ADD CONSTRAINT fk_venda_cupom_rastreio
FOREIGN KEY (venda_compra_loja_virtual_id)
REFERENCES tb_cupom_venda(id);