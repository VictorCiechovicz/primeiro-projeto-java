package expressoes;

public class ImpressorCupom {

    public void imprimir(Cupom cupom) {


        StringBuilder conteudo = new StringBuilder();
        conteudo.append(tracos());
        conteudo.append(cupom.nomeFantasia + "\n");
        Endereco end = cupom.endereco;
        String enderecoCupom = String.format("%s N. %s %s", end.logradouro, end.numero, end.complemento);
        conteudo.append(enderecoCupom + "\n");
        String formatDocumento = cpfCnpj(cupom.cpf);
        String documento = String.format("CPF/CNPJ: %s", formatDocumento);
        conteudo.append(documento + "\n");
    

        conteudo.append(tracos());

        System.out.println(conteudo.toString());
    }


    private String tracos() {
        String repeated = new String(new char[50]).replace("\0", "-");
        return repeated + "\n";
    }

    public String cpfCnpj(String documento) {
        if (documento == null) {
            return "";
        }
        // Remove todos os caracteres não numéricos
        String documentoLimpo = documento.replaceAll("[^0-9]", "");

        // Verifica se é um CPF (11 dígitos)
        if (documentoLimpo.length() == 11) {
            // Aplica a máscara de CPF: ###.###.###-##
            return documentoLimpo.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
        }
        // Verifica se é um CNPJ (14 dígitos)
        else if (documentoLimpo.length() == 14) {
            // Aplica a máscara de CNPJ: ##.###.###/####-##
            return documentoLimpo.replaceAll("(\\d{2})(\\d{3})(\\d{3})(\\d{4})(\\d{2})", "$1.$2.$3/$4-$5");
        }
        // Se não for CPF nem CNPJ, retorna o documento sem formatação
        return documentoLimpo;
    }
}
