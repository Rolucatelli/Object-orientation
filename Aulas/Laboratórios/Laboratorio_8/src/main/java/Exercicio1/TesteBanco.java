package Exercicio1;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;

public class TesteBanco {

    public static void main(String[] args) {
        Banco banco = new Banco();

        System.out.println("------------------CRIAÇÃO DE CONTAS BANCÁRIAS------------------");
        System.out.println();
        // Criação do primeiro cliente Bruno Henrique e sua respectiva conta com saldo inicial
        Cliente brunoHenrique = new Cliente("Bruno", "Henrique");
        Conta contaBH = new ContaPoupanca(50000, 0.03);
        brunoHenrique.setConta(contaBH);
        System.out.println("Criando uma conta poupança para o cliente " + brunoHenrique.getNome() + " " +
                brunoHenrique.getSobrenome() + " com saldo de R$: " + brunoHenrique.getConta().getSaldo() +
                " e taxa de rendimentos de 3%");

        // Criação do primeiro cliente Everton Ribeiro e sua respectiva conta com saldo inicial
        Cliente evertonRibeiro = new Cliente("Everton", "Ribeiro");
        Conta contaER = new ContaCorrente(45000,30000);
        evertonRibeiro.setConta(contaER);
        System.out.println("Criando uma conta corrente para o cliente " + evertonRibeiro.getNome() + " " +
                evertonRibeiro.getSobrenome() + " com saldo de R$: " + evertonRibeiro.getConta().getSaldo() +
                " e cheque especial de R$ 30000");

        // Criação do primeiro cliente Filipe Luis e sua respectiva conta com saldo inicial
        Cliente filipeLuis = new Cliente("Filipe", "Luis");
        Conta contaFilipeLuis = new ContaCorrente(70000);
        filipeLuis.setConta(contaFilipeLuis);
        System.out.println("Criando uma conta corrente para o cliente " + filipeLuis.getNome() + " " +
                filipeLuis.getSobrenome() + " com saldo de R$: " + filipeLuis.getConta().getSaldo() +
                " e sem cheque especial");


        // Criação do primeiro cliente e sua respectiva conta com saldo inicial
        Cliente gabrielBarbosa = new Cliente("Gabriel", "Barbosa");
        Conta contaGB = new ContaPoupanca(220000, 0.03);
        gabrielBarbosa.setConta(contaGB);
        System.out.println("Criando uma conta poupança para o cliente " + gabrielBarbosa.getNome() + " " +
                gabrielBarbosa.getSobrenome() + " com saldo de R$: " + gabrielBarbosa.getConta().getSaldo() +
                " e taxa de rendimentos de 3%");

        // Criação do primeiro cliente e sua respectiva conta com saldo inicial
        Cliente diegoAlves = new Cliente("Diego", "Alves");
        Conta contaDA = new ContaCorrente(50000);
        diegoAlves.setConta(contaDA);
        System.out.println("Criando uma conta corrente para o cliente " + diegoAlves.getNome() + " " +
                diegoAlves.getSobrenome() + " com saldo de R$: " + diegoAlves.getConta().getSaldo() +
                " e sem cheque especial");

        Cliente lorenaLara = new Cliente("Lorena", "Lara");
        lorenaLara.setConta(contaDA);

        System.out.println("Diego Alves autorizou o cadastro de sua conta corrente como sendo conjunta com a cliente Lorena Lara");

        banco.adicionarCliente(brunoHenrique);
        banco.adicionarCliente(evertonRibeiro);
        banco.adicionarCliente(filipeLuis);
        banco.adicionarCliente(gabrielBarbosa);
        banco.adicionarCliente(diegoAlves);
        banco.adicionarCliente(lorenaLara);

    }
}
