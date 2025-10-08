
package conta_corrente;


import java.time.LocalDate;
import java.util.Date;

public class ContaCorrenteApp {
    int numeroConta;
    int numeroAgencia;
    int numeroCliente;
    LocalDate dataNacimento;
    Double saldoConta;

    public void sacarValor(Double valor){
        saldoConta = 1000.00;
        double novoSaldo = valor - saldoConta;
        System.out.println("Saldo atual: " + novoSaldo);

    }

    public void transferirValorParaOutraConta(Double valor){
        saldoConta = 1000.00;
        double novoSaldo = valor - saldoConta;
        System.out.print("Digite numero da conta para transferir:");
        System.out.println("Valor trasnferido: " + valor);
        System.out.println("Saldo atual: " + novoSaldo);


    }

    public void cancelarConta(){
        System.out.print("Qual motivo para concelar");
        System.out.println("Conta cancelada com sucesso!");

    }

    public void consultaExtrato(Date data1, Date data2){
        saldoConta = 1000.00;
        System.out.print("Entre as datas:" + data1.toString() + " - " + data2.toString());
        System.out.println("Saldo: " + saldoConta);

    }
    public void consultaSaldo(){
        saldoConta = 1000.00;
        System.out.println("Saldo da conta:" + saldoConta);

    }
}
