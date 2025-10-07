package sintaxe_semantica;

public class Conta{

    double saldo = 10.0;
    double novoSaldo;

    public void sacar(Double valor) {
        novoSaldo = saldo - valor;
    }

    public void imprimirSaldo(){
        System.out.println("Saldo anterior: " + saldo);
        System.out.println("Saldo atual: " + novoSaldo);
    }
}