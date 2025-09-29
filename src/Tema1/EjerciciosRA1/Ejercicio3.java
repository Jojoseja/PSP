package Tema1.EjerciciosRA1;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            String input = sc.nextLine();
            if  (input.equals("fin")) {
                exit = true;
                break;
            } else {
                System.out.println(llamarProceso());
            }

        }

    }
    public static String llamarProceso(){
        Path pa =  Path.of("out", "production", "PSP");
        File fi = new File(pa.toString());
        ProcessBuilder pb = new ProcessBuilder("java", "Tema1.EjerciciosRA1.Aleatorio");
        pb.directory(fi);
        String line = "";
        try {
            Process p = pb.start();
            try (BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()))) {
                while ((line = br.readLine()) != null) {
                    return line;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            return line;
        }

    }
}
