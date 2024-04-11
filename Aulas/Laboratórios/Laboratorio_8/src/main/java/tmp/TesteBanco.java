package tmp;


public class TesteBanco {
    public static void main(String[] args) {
        Cliente brunoHenrique = new Cliente("Bruno", "Henrique");

        brunoHenrique.setConta(new Conta(50000));
        System.out.println("Criando uma conta do Bruno Henrique");


        System.out.println("Sacando 1200: " + brunoHenrique.getConta().sacar(1200));
        System.out.println("Depositando 8525: " + brunoHenrique.getConta().depositar(8525));
        System.out.println("Sacando 12800: " + brunoHenrique.getConta().sacar(12800));
        System.out.println("Sacando 50000: " + brunoHenrique.getConta().sacar(50000));

        System.out.println("Saldo final: " + brunoHenrique.getConta().getSaldo());


    }
}
