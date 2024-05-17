package excessoes.exercicio1;

public class TesteExcecao {
    public static void main (String [] args) {
        try {
            for (int i=0; i < args.length + 1; i++){
                System.out.println("args[" + i + "] = " + args[i]);
            }
        }catch(Exception ArrayIndexOutOfBoundsException){
            System.out.println("Exceção capturada..:" + ArrayIndexOutOfBoundsException);
            System.out.println("A aplicação está sendo fechada");
        }

    }
}
