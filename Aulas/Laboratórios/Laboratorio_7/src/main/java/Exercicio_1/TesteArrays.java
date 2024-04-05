package Exercicio_1;

import java.util.Arrays;
public class TesteArrays {

    public static void printArray(int[] array1){
        System.out.print("<");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);
            if ((i + 1) < array1.length) {
                System.out.print(", ");
            }
        }
        System.out.println(">");
    }

    public static void main(String[] args) {
        int[] array1 = {2, 3, 5, 7, 11, 13, 17, 19};
        int[] array2 = array1;

        printArray(array1);

        for (int i = 0; i < array2.length; i++){
            array2[i] = i;
        }
        System.out.println("Imprimindo após a atribuição:");

        printArray(array1);
        printArray(array2);



        System.out.println("Imprimindo a matriz:");

        int[][] matriz = new int[5][];

        for (int i = 0; i < matriz.length; i++) {
            matriz[i] = new int[i];
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i * j;
            }
            printArray(matriz[i]);
        }


    }
}
