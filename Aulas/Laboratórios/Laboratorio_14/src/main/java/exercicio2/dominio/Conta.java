package exercicio2.dominio;

import exercicio2.dominio.excecoes.ExcecaoChequeEspecial;

public class Conta {

    protected double saldo;

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean depositar(double valor) {
        saldo = saldo + valor;
        return true;
    }

    public boolean sacar(double valor) throws ExcecaoChequeEspecial {
        if ((this.saldo  - valor) >= 0) {
            saldo = saldo - valor;
            return true;
        }
        throw new ExcecaoChequeEspecial("Saldo insuficiente", (saldo - valor));
    }


}
