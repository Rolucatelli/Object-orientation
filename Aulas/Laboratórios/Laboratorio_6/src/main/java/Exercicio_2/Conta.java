package Exercicio_2;

public class Conta {

    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public boolean depositar(double valor) {
        saldo += valor;
        return true;
    }

    public boolean sacar(double valor) {
        if (valor > saldo) {
            return false;
        }

        saldo -= valor;
        return true;

    }

    public Conta(double saldoInicial) {
        saldo = saldoInicial;
    }

}
