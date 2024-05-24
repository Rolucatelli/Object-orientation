package exercicio2.dominio;

import exercicio2.dominio.excecoes.ExcecaoChequeEspecial;

public class ContaCorrente extends Conta {

    private double chequeEspecial;

    public ContaCorrente(double saldoInicial, double chequeEspecial) {
        super(saldoInicial);
        this.chequeEspecial = chequeEspecial;
    }

    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }

    public boolean sacar(double valor) throws ExcecaoChequeEspecial {
        if (valor <= (chequeEspecial + saldo)){

            saldo -= valor;

            return true;
        }
        if (chequeEspecial == 0){
            throw new ExcecaoChequeEspecial("Não há cheque especial", (saldo-valor));
        } else {
            throw new ExcecaoChequeEspecial("Saldo insuficiente no cheque especial",
                    saldo + chequeEspecial - valor);
        }
    }
}
