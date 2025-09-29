package Tema1.EjerciciosRA1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Introduce un número: ");
            double num = Double.valueOf(sc.nextLine());
            Path pa = Path.of("out", "production", "PSP" );
            File file = new  File(pa.toString());
            ProcessBuilder pb = new ProcessBuilder("java", "Tema1.EjerciciosRA1.ProcesoHijo", String.valueOf(num));
            pb.directory(file);
            Process p = pb.start();

            try (BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()))) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            } catch(Exception e){
                System.out.println(e + " " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println(e + " " + e.getMessage());
        }
    }
}
