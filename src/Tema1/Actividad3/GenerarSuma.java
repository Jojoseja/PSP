package Tema1.Actividad3;

import java.io.*;
import java.util.Scanner;

public class GenerarSuma {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){

            ProcessBuilder p = new ProcessBuilder("java", "Tema1.Actividad3.SumaNumeros");

            File file = new File("out/production/PSP");

            p.directory(file);

            Process p1 = p.start();

            try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(p1.getOutputStream()))) {
                String num1 = sc.nextLine();

                bw.write(num1 + "\n");
                bw.flush();

                String num2 = sc.nextLine();

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
