ALTER TABLE tb_cupom_venda
ADD CONSTRAINT fk_tb_cupom_venda_tb_forma_pagamento
FOREIGN KEY (forma_pagamento_id)
REFERENCES tb_forma_pagamento(id);