package Repaso;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        int[] listaNumeros = new int[5];
        Scanner sc = new Scanner(System.in);
        try {
            for (int i = 0; i < listaNumeros.length; i++) {
                listaNumeros[i] = sc.nextInt();
            }
            for (int i = 0; i < listaNumeros.length; i++) {
                System.out.println(listaNumeros[i]);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }
}
