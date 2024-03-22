package Transportadora.Encapsulamento.versao2;

public class Veiculo {
    double carga, cargaMaxima;


    public double getCarga() {
        return carga;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public boolean adicionarCaixa(double carga){
        if (this.carga + carga < cargaMaxima){
            this.carga += carga;
            return true;
        }else {
            return false;
        }
    }
}
