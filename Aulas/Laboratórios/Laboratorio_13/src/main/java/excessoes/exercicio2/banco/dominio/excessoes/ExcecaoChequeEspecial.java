package excessoes.exercicio2.banco.dominio.excessoes;

public class ExcecaoChequeEspecial extends java.lang.Exception{
    private double deficit;

    public ExcecaoChequeEspecial(String mensagem, double deficit){
        super(mensagem);
        this.deficit = deficit;
    }

    public double getDeficit() {
        return deficit;
    }
}
