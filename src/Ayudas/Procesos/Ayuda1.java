package Ayudas.Procesos;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Ayuda1 {
    public static void main(String[] args) {
        try {
            ProcessBuilder pb = new ProcessBuilder("java", "-version");

            File input = new File("src/Ayudas/Procesos/Hola.txt");
            File output = new File("src/Ayudas/Procesos/Adios.txt");
            pb.redirectInput(input);
            pb.redirectOutput(output);

            Process p = pb.start();

            

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
