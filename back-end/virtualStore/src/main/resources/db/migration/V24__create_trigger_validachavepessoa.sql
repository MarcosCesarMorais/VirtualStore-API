CREATE TRIGGER tg_up_tb_conta_receber
BEFORE UPDATE ON tb_conta_receber
FOR EACH ROW
EXECUTE PROCEDURE validachavepessoa();

CREATE TRIGGER tg_up_tb_endereco
BEFORE UPDATE ON tb_endereco
FOR EACH ROW
EXECUTE PROCEDURE validachavepessoa();

CREATE TRIGGER tg_up_tb_nota_fiscal_compra
BEFORE UPDATE ON tb_nota_fiscal_compra
FOR EACH ROW
EXECUTE PROCEDURE validachavepessoa();

CREATE TRIGGER tg_up_tb_usuario
BEFORE UPDATE ON tb_usuario
FOR EACH ROW
EXECUTE PROCEDURE validachavepessoa();

CREATE TRIGGER tg_up_tb_cupom_venda
BEFORE UPDATE ON tb_cupom_venda
FOR EACH ROW
EXECUTE PROCEDURE validachavepessoa();

CREATE TRIGGER tg_ins_tb_conta_receber
BEFORE INSERT ON tb_conta_receber
FOR EACH ROW
EXECUTE PROCEDURE validachavepessoa();

CREATE TRIGGER tg_ins_tb_endereco
BEFORE INSERT ON tb_endereco
FOR EACH ROW
EXECUTE PROCEDURE validachavepessoa();

CREATE TRIGGER tg_ins_tb_nota_fiscal_compra
BEFORE INSERT ON tb_nota_fiscal_compra
FOR EACH ROW
EXECUTE PROCEDURE validachavepessoa();

CREATE TRIGGER tg_ins_tb_usuario
BEFORE INSERT ON tb_usuario
FOR EACH ROW
EXECUTE PROCEDURE validachavepessoa();

CREATE TRIGGER tg_ins_tb_cupom_venda
BEFORE INSERT ON tb_cupom_venda
FOR EACH ROW
EXECUTE PROCEDURE validachavepessoa();

CREATE TRIGGER tg_up_tb_avaliacao_produto
BEFORE UPDATE ON tb_avaliacao_produto
FOR EACH ROW
EXECUTE PROCEDURE validachavepessoa();

CREATE TRIGGER tg_ins_tb_avaliacao_produto
BEFORE INSERT ON tb_avaliacao_produto
FOR EACH ROW
EXECUTE PROCEDURE validachavepessoa();

CREATE TRIGGER tg_up_tb_conta_pagar
BEFORE UPDATE ON tb_conta_pagar
FOR EACH ROW
EXECUTE PROCEDURE validachavepessoa();

CREATE TRIGGER tg_ins_tb_conta_pagar
BEFORE INSERT ON tb_conta_pagar
FOR EACH ROW
EXECUTE PROCEDURE validachavepessoa();
