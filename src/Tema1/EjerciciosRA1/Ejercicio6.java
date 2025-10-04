package Tema1.EjerciciosRA1;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ejercicio6 {
    public static void main(String[] args) {
        try {
            //Process Builders
            ProcessBuilder pba = new ProcessBuilder("java", "-cp", "out/production/PSP", "Tema1.EjerciciosRA1.Ejercicio6Hijo", "a", "a.txt" );
            ProcessBuilder pbe = new ProcessBuilder("java", "-cp", "out/production/PSP", "Tema1.EjerciciosRA1.Ejercicio6Hijo", "e", "e.txt" );
            ProcessBuilder pbi = new ProcessBuilder("java", "-cp", "out/production/PSP", "Tema1.EjerciciosRA1.Ejercicio6Hijo", "i", "i.txt" );
            ProcessBuilder pbo = new ProcessBuilder("java", "-cp", "out/production/PSP", "Tema1.EjerciciosRA1.Ejercicio6Hijo", "o", "o.txt" );
            ProcessBuilder pbu = new ProcessBuilder("java", "-cp", "out/production/PSP", "Tema1.EjerciciosRA1.Ejercicio6Hijo", "u", "u.txt" );

            //Process
            Process pa = pba.start();
            Process pe = pbe.start();
            Process pi = pbi.start();
            Process po = pbo.start();
            Process pu = pbu.start();

            //Exit Values
            int exitvala = pa.waitFor();
            int exitvale = pe.waitFor();
            int exitvali = pi.waitFor();
            int exitvalo = po.waitFor();
            int exitvalu = pu.waitFor();

            System.out.println("Pro A: " + exitvala + " Pro E: " + exitvale + " Pro I: " + exitvali + " Pro O: " + exitvalo +  " Pro U: " + exitvalu);

            int totalVocales = 0;
            //Reader Vocal
            Path patha = Path.of("src", "Tema1", "EjerciciosRA1", "a.txt");
            File filea = new File(patha.toString());
            try (BufferedReader br = new BufferedReader(new FileReader(filea))) {
                String line;
                while ((line = br.readLine()) != null) {
                    totalVocales += Integer.parseInt(line);
                }
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }

            Path pathe = Path.of("src", "Tema1", "EjerciciosRA1", "e.txt");
            File filee = new File(patha.toString());
            try (BufferedReader br = new BufferedReader(new FileReader(filee))) {
                String line;
                while ((line = br.readLine()) != null) {
                    totalVocales += Integer.parseInt(line);
                }
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }

            Path pathi = Path.of("src", "Tema1", "EjerciciosRA1", "i.txt");
            File filei = new File(patha.toString());
            try (BufferedReader br = new BufferedReader(new FileReader(filei))) {
                String line;
                while ((line = br.readLine()) != null) {
                    totalVocales += Integer.parseInt(line);
                }
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }

            Path patho = Path.of("src", "Tema1", "EjerciciosRA1", "o.txt");
            File fileo = new File(patha.toString());
            try (BufferedReader br = new BufferedReader(new FileReader(fileo))) {
                String line;
                while ((line = br.readLine()) != null) {
                    totalVocales += Integer.parseInt(line);
                }
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }

            Path pathu = Path.of("src", "Tema1", "EjerciciosRA1", "u.txt");
            File fileu = new File(patha.toString());
            try (BufferedReader br = new BufferedReader(new FileReader(fileu))) {
                String line;
                while ((line = br.readLine()) != null) {
                    totalVocales += Integer.parseInt(line);
                }
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }

            Path pathOutput = Path.of("src", "Tema1", "EjerciciosRA1", "out.txt");
            File fileOutput = new File(pathOutput.toString());
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileOutput))) {
                bw.write(String.valueOf(totalVocales));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
