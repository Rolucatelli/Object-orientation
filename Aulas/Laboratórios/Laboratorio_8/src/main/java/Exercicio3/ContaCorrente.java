package Exercicio3;

public class ContaCorrente extends Conta {

    private double chequeEspecial;

    public ContaCorrente(double saldoInicial, double chequeEspecial) {
        super(saldoInicial);
        this.chequeEspecial = chequeEspecial;
    }

    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }

    public boolean sacar(double valor){
        if (valor <= (chequeEspecial + saldo)){

            saldo -= valor;

            return true;
        }
        return false;
    }
}
