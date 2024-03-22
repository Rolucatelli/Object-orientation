package Transportadora.main;

//import Transportadora.Encapsulamento.versao1.Veiculo;

//import Transportadora.Encapsulamento.versao2.Veiculo;

import Transportadora.Encapsulamento.versao3.Veiculo;

class Main {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo();

        System.out.println("Criando um veículo com carga máxima 10.000 kg");
        veiculo.setCargaMaxima(10000);
        System.out.println("Adicionando Caixa número 1 (500 kg) : " + veiculo.adicionarCaixa(500));
        System.out.println("Adicionando Caixa número 2 (250 kg) : " + veiculo.adicionarCaixa(250));
        System.out.println("Adicionando Caixa número 3 (5000 kg) : " + veiculo.adicionarCaixa(5000));
        System.out.println("Adicionando Caixa número 4 (4000 kg) : " + veiculo.adicionarCaixa(4000));
        System.out.println("Adicionando Caixa número 5 (300 kg) : " + veiculo.adicionarCaixa(300));
        System.out.println("A carga do veículo é de: " + veiculo.newtonsParaQuilos(veiculo.getCarga()) + "kg");

    }
}
