package Exercicio3;

import java.util.ArrayList;

public class EsqueletoTesteBanco3 {

  public static void main(String[] args) {
    EsqueletoTesteBanco3 testeBanco = new EsqueletoTesteBanco3();
    Banco banco = new Banco();
    Cliente cliente;

    // Cria vários clientes e suas respectivas contas
    Cliente brunoHenrique = new Cliente("Bruno", "Henrique");
    banco.adicionarCliente(brunoHenrique);
    cliente = banco.getCliente(0);
    cliente.adicionarConta(new ContaPoupanca(50000.00, 0.03));
    cliente.adicionarConta(new ContaCorrente(220000.00, 40000.00));

    Cliente outroBrunoHenrique = new Cliente("Bruno", "Henrique");
    banco.adicionarCliente(outroBrunoHenrique);
    cliente = banco.getCliente(1);
    cliente.adicionarConta(new ContaPoupanca(2000.00, 0.03));

    Cliente gabrielBarbosa = new Cliente("Gabriel", "Barbosa");
    banco.adicionarCliente(gabrielBarbosa);
    cliente = banco.getCliente(2);
    cliente.adicionarConta(new ContaPoupanca(220000.00, 0.03));

    // Gera um Relatório
    System.out.println("\t\t\t\t\tRESULTADO DA BUSCA");
    System.out.println("==============================================================");

    System.out.println("Nome fornecido para busca...: Bruno Henrique");
    ArrayList<Cliente> clientes = banco.getCliente("Bruno", "Henrique");

    exibirDetalhes(clientes);

    System.out.println();
    System.out.println("==============================================================");

    System.out.println("Nome fornecido para busca...: Gabriel Barbosa");
    clientes = banco.getCliente("Gabriel", "Barbosa");

    exibirDetalhes(clientes);

    System.out.println();
    System.out.println("==============================================================");

    System.out.println("Nome fornecido para busca...: Giorgian De Arrascaeta");
    clientes = banco.getCliente("Giorgian", "De Arrascaeta");

    exibirDetalhes(clientes);

    System.out.println();
    System.out.println("==============================================================");
  }

  /***
   * Implemente  o método exibirDetalhes de forma a produzir a saída exibida no enunciado
   * do exercício 3
   */
    public static void exibirDetalhes(ArrayList<Cliente> clientes){
      System.out.println("Temos " + clientes.size() + " cliente(s) com o nome fornecido");
      System.out.println();

      for (int i = 0; i < clientes.size(); i++){
        Cliente cliente = clientes.get(i);
        System.out.println("Cliente " + (i+1) + "...: " + cliente.getNome() + " " + cliente.getSobrenome());
        for (int j = 0; j < cliente.getNumeroDeContas(); j++) {
          Conta conta = cliente.getConta(j);
          String tipoConta = (conta instanceof ContaCorrente) ? "Conta Corrente" : "Conta Poupança";

          System.out.println("Tipo de conta: " + tipoConta + " com saldo de R$ " + conta.getSaldo());
        }
      }
    }
}


