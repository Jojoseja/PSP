package Repaso;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        //Objeto Scanner para introducir datos por teclado
        Scanner sc = new Scanner(System.in);

        //Objeto array para almacenar datos
        int[] lista = new int[10];

        //Introducir datos en la array
        lista[0] = 1;
        lista[1] = 3;
        lista[2] = 5;
        lista[3] = 7;
        lista[4] = 9;

        while (lista[9] == 0) {
            int input = sc.nextInt();
            for (int i = 0; i < lista.length; i++) {
                if (input <= lista[i]) {
                    for (int j = lista.length-1; j > i; j--) {
                        lista[j] = lista[j-1];
                    }
                    lista[i] = input;
                    break;
                } if (lista[i] == 0) {
                    lista[i] = input;
                    break;
                }
            }
            for (int num : lista) {
                System.out.print(num + ", ");
            }
        }
    }
}
