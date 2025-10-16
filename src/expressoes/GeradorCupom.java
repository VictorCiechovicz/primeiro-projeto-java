package expressoes;

import java.time.LocalDate;
import java.time.LocalTime;

public class GeradorCupom {

    public Cupom gerar() {

        Cupom cupom = new Cupom();

        cupom.data = LocalDate.now();
        cupom.hora = LocalTime.now();
        cupom.nomeFantasia = "ANALOGIA JAVA LMTD.";

        Endereco endereco = new Endereco();

        endereco.cidade = "Panambi";
        endereco.bairro = "Alvorada";
        endereco.cep = "98280000";
        endereco.numero = "1234";
        endereco.complemento = "casa verde";
        endereco.uf = "RS";
        endereco.logradouro = "Otto rehn";

        cupom.endereco = endereco;
        cupom.ccf = 123;
        cupom.cdd = 123;
        cupom.cpf = "03733537976";
        cupom.ie = "01.203.231";
        cupom.im = "123.203.231";


        CupomItem item01 = new CupomItem();

        item01.ordem = 1;
        item01.sku = 123;
        item01.descricao = "descricao";
        item01.preco = 123.203;
        item01.und = "KG";
        item01.quantidade = 123.203;
        item01.subtototal = 5.90;
        cupom.itens.add(item01);

        return cupom;
    }


}
