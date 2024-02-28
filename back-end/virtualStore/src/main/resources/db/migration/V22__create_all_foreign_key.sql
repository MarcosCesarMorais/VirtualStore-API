ALTER TABLE tb_item_venda_loja
ADD CONSTRAINT fk_tb_venda_cupom_tb_item_venda
FOREIGN KEY (venda_compra_loja_virtual_id)
REFERENCES tb_cupom_venda(id);

ALTER TABLE tb_status_rastreio
ADD CONSTRAINT fk_tb_status_rastreio_tb_cupom_venda
FOREIGN KEY (venda_compra_loja_virtual_id)
REFERENCES tb_cupom_venda(id);

ALTER TABLE tb_nota_fiscal_venda
ADD CONSTRAINT fk_tb_venda_cupom_tb_nota_fiscal_venda
FOREIGN KEY (venda_compra_loja_virtual_id)
REFERENCES tb_cupom_venda(id);

ALTER TABLE tb_usuario_acesso
ADD CONSTRAINT fk_tb_usuario_tb_usuario_acesso
FOREIGN KEY (usuario_id)
REFERENCES tb_usuario(id);

ALTER TABLE tb_nota_item_produto
ADD CONSTRAINT fk_tb_produto_tb_nota_item_produto
FOREIGN KEY (produto_id)
REFERENCES tb_produto(id);

ALTER TABLE tb_item_venda_loja
ADD CONSTRAINT fk_tb_item_venda_loja_tb_produto
FOREIGN KEY (produto_id)
REFERENCES tb_produto(id);

ALTER TABLE tb_imagem_produto
ADD CONSTRAINT fk_tb_imagem_produto_tb_produto
FOREIGN KEY (produto_id)
REFERENCES tb_produto(id);

ALTER TABLE tb_avaliacao_produto
ADD CONSTRAINT fk_tb_avaliacao_produto_tb_produto
FOREIGN KEY (produto_id)
REFERENCES tb_produto(id);

ALTER TABLE tb_cupom_venda
ADD CONSTRAINT fk_tb_cupom_venda_tb_nota_fiscal_venda
FOREIGN KEY (nota_fiscal_venda_id)
REFERENCES tb_nota_fiscal_venda(id);

ALTER TABLE tb_nota_item_produto
ADD CONSTRAINT fk_tb_nota_item_produto_tb_nota_fiscal_compra
FOREIGN KEY (nota_fiscal_compra_id)
REFERENCES tb_nota_fiscal_compra(id);

ALTER TABLE tb_cupom_venda
ADD CONSTRAINT fk_tb_cupom_venda_tb_forma_pagamento
FOREIGN KEY (forma_pagamento_id)
REFERENCES tb_forma_pagamento(id);

ALTER TABLE tb_cupom_venda
ADD CONSTRAINT fk_tb_cupom_venda_tb_endereco_entrega
FOREIGN KEY (endereco_entrega_id)
REFERENCES tb_endereco(id);

ALTER TABLE tb_cupom_venda
ADD CONSTRAINT fk_tb_cupom_venda_tb_endereco_cobranca
FOREIGN KEY (endereco_cobranca_id)
REFERENCES tb_endereco(id);

ALTER TABLE tb_cupom_venda
ADD CONSTRAINT fk_tb_cupom_venda_tb_cupom_desconto
FOREIGN KEY (cupom_desconto_id)
REFERENCES tb_cupom_desconto(id);

ALTER TABLE tb_nota_fiscal_compra
ADD CONSTRAINT fk_tb_nota_fiscal_compra_tb_conta_pagar
FOREIGN KEY (conta_pagar_id)
REFERENCES tb_conta_pagar(id);

ALTER TABLE tb_usuario_acesso
ADD CONSTRAINT fk_tb_usuario_acesso_tb_acesso
FOREIGN KEY (acesso_id)
REFERENCES tb_acesso(id);