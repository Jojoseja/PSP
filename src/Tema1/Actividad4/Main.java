package Tema1.Actividad4;

import java.io.*;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        //Obtener Datos de un Archivo .txt
        Path pInp = Path.of("src", "Tema1", "Actividad4", "input.txt");
        File fInp = pInp.toFile();

        String input = "";
        try (BufferedReader br = new BufferedReader(new FileReader(fInp))) {
            String line;
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            input = sb.toString();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        ProcessBuilder pb =  new ProcessBuilder("java", "Tema1.Actividad4.LeerNombre", input);
        Path path = Path.of("out", "production", "PSP");
        File f = new File(path.toString());
        pb.directory(f);

        //Archivo Salida
        Path pSal = Path.of("src", "Tema1", "Actividad4", "salida.txt");
        File fSal = new  File(pSal.toString());

        //Archivo Error
        Path pErr = Path.of("src", "Tema1", "Actividad4", "error.txt");
        File fErr = new  File(pErr.toString());

        try {
            Process p = pb.start();
            int exitval;
            //Lectura Programa
            try (BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()))) {
                String line;
                while ((line = br.readLine()) != null) {
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter(fSal, true))) {
                        bw.write(line);
                        bw.newLine();
                    }
                }
            }
            catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
