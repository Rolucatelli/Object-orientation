package Transportadora.Encapsulamento.versao3;

public class Veiculo {
    double carga, cargaMaxima;


    public double getCarga() {
        return carga;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(double cargaMaxima) {
        this.cargaMaxima = quilosParaNewtons(cargaMaxima);
    }

    public boolean adicionarCaixa(double carga){
        carga = quilosParaNewtons(carga);
        if (this.carga + carga < cargaMaxima){
            this.carga += carga;
            return true;
        }else {
            return false;
        }
    }

    public double newtonsParaQuilos(double peso){
        return peso * 9.8;
    }

    public double quilosParaNewtons(double peso){
        return peso / 9.8;
    }
}
