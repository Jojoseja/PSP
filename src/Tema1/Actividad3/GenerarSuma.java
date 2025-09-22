package Tema1.Actividad3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class GenerarSuma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            ProcessBuilder p = new ProcessBuilder("java", "SumaNumeros");
            Process p1 = p.start();

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(p1.getOutputStream()));
            BufferedReader br = new BufferedReader(new InputStreamReader(p1.getInputStream()));
            bw.write(sc.nextInt() + "\n" );
            bw.write(sc.nextInt() + "\n" );
            sc.close();
            bw.flush();
            bw.close();

            String line;
            System.out.println("Output");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            p1.waitFor();

            System.out.println(p1.exitValue());
            br.close();

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
