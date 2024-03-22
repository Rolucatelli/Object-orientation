import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número que quer calcular o fatorial: ");
        long fat = scanner.nextLong();

        if (fat == 0) {
            fat = 1;
        }

        for (long i = fat - 1L; i > 1; i--) {
            fat *= i;
        }


        System.out.print("\nResultado: ");
        System.out.println(fat);

    }
}