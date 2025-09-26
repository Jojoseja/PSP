package Tema1.Actividad3;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class GenerarSuma {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){

            ProcessBuilder p = new ProcessBuilder("java", "Tema1.Actividad3.SumaNumeros");

            Path pa =  Paths.get("out", "production", "PSP");
            File file = new File(pa.toString());

            p.directory(file);

            Process p1 = p.start();

            try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(p1.getOutputStream()))) {
                int num1, num2;
                while (true) {
                    try {
                        num1 = sc.nextInt();
                        break;
                    } catch (Exception e) {
                        System.out.println("Introduce un número válido");
                        sc.next();
                    }
                }
                while (true) {
                    try {
                        num2 = sc.nextInt();
                        break;
                    } catch (Exception e) {
                        System.out.println("Introduce un número válido");
                        sc.next();
                    }
                }

                bw.write(num1 + "\n");
                bw.flush();

                bw.write(num2 + "\n");
                bw.flush();
            }

            try (BufferedReader br = new BufferedReader(new InputStreamReader(p1.getInputStream()))) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            }

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
