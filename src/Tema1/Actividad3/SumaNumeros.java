package Tema1.Actividad3;

import java.util.Scanner;

public class SumaNumeros {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        Scanner sc = new Scanner(System.in);

        try {
            while (true) {
                try {
                    num1 = sc.nextInt();
                    while (true) {
                        try {
                            num2  = sc.nextInt();
                            break;
                        } catch (Exception e) {
                            System.out.println("Error En el numero 2: " + e);
                            sc.next();
                        }
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("Error en el numero 1: " + e);
                    sc.next();
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        int suma = num1 + num2;
        System.out.println(suma);
    }
}
