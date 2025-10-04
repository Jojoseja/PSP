package Tema1.EjerciciosRA1;

import java.io.*;
import java.nio.file.Path;

public class Ejercicio6Hijo {
    public static void main(String[] args) {
        //Archivo a leer
        Path path = Path.of("src", "Tema1", "EjerciciosRA1", "Lorem ipsum.txt");
        File file = new File(path.toString());

        //Archivo Output
        Path path1 = Path.of("src", "Tema1", "EjerciciosRA1", args[1]);
        File file1 = new File(path1.toString());


        String vocal = args[0];
        vocal = vocal.toLowerCase();
        int contador = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.toLowerCase();
                for  (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) == vocal.charAt(0)) {
                        contador++;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file1))) {
            String conS = String.valueOf(contador);
            bw.write(conS);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
