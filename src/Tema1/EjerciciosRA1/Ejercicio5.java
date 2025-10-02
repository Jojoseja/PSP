package Tema1.EjerciciosRA1;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inicio;
        int fin;
        try (DataInputStream dis = new DataInputStream(new FileInputStream("numeros.dat"))) {
            while (true) {
                try {
                    while (true) {
                        try {
                            System.out.println("Introduce el primer numero(inclusive)");
                            inicio = sc.nextInt();
                            break;
                        } catch (Exception ex) {
                            System.out.println("No se puede introducir el segundo numero");
                        }
                    }
                    System.out.println("Introduce el segundo numero(inclusive)");
                    fin = sc.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    sc.next();
                }
            }
            int counter = 1;
            int total = 0;
            while (dis.available() > 0) {
                int numero = dis.readInt();
                if (counter >= inicio && counter <= fin) {
                    total += numero;
                }
            }
            System.out.println("Total de los datos: " + total);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
