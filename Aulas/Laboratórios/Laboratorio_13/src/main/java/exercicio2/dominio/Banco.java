package exercicio2.dominio;

import java.util.ArrayList;
import java.util.Objects;

public class Banco {
    private ArrayList<Cliente> clientes;
    private static Banco banco;

    private Banco() {

        clientes = new ArrayList<>();
    }

    public static Banco getBanco(){
        if (banco == null) {
            banco = new Banco();
        }
        return banco;
    }
    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public Cliente getCliente(int indice) {
        return clientes.get(indice);
    }

    public ArrayList<Cliente> getCliente(String nome, String sobrenome){
        ArrayList<Cliente> busca = new ArrayList<>();
        for (int i = 0; i < clientes.size(); i++){
            if (Objects.equals(clientes.get(i).getNome(), nome) && Objects.equals(clientes.get(i).getSobrenome(), sobrenome)){
                busca.add(clientes.get(i));
            }
        }
        return busca;
    }

    public int getNumeroDeClientes() {
        return this.clientes.size();
    }
}
