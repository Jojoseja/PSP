package Tema1.EjerciciosRA1;

import java.io.*;
import java.nio.file.Path;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inicio;
        int fin;
        Path path = Path.of("src", "Tema1", "EjerciciosRA1", "numeros.dat");
        File file = path.toFile();
        try (BufferedReader dis = new BufferedReader(new FileReader(file))) {
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
            int counter = 0;
            int total = 0;
            String line;
            while ((line = dis.readLine()) != null) {
                counter++;
                if (counter >= inicio && counter <= fin) {
                    total += Integer.parseInt(line);
                }
            }
            System.out.println("Total de los datos: " + total);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
