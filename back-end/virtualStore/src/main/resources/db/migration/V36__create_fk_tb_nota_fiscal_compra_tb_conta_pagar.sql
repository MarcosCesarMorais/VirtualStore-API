ALTER TABLE tb_nota_fiscal_compra
ADD CONSTRAINT fk_tb_nota_fiscal_compra_tb_conta_pagar
FOREIGN KEY (conta_pagar_id)
REFERENCES tb_conta_pagar(id);