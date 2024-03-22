package Transportadora.Encapsulamento.versao1;

public class Veiculo {
    double carga, cargaMaxima, peso;


    public double getCarga() {
        return carga;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCarga(double carga) {
        this.carga += carga;
    }

    public void setCargaMaxima(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }
}
