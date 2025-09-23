package Ayudas.Procesos;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Ayuda1 {
    public static void main(String[] args) {
        try {
            ProcessBuilder pb = new ProcessBuilder("java", "Ayudas.Procesos.HelloWorld");

            File file = new File("out/production/PSP");

            pb.directory(file);

            Process p = pb.start();

            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            int exitCode =  p.waitFor();

            System.out.println(exitCode);


        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
