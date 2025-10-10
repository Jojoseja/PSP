package Tema1.EjerciciosRA1.Ejercicio7;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.util.ArrayList;

public class Ejercicio7 {
    public static void main(String[] args) {
        try {
            ArrayList<String> listaNumeros = new ArrayList<>();

            //Ruta Archivo Finanzas
            Path paFinanzas = Path.of("src", "Tema1", "Ejercicio7", "finanzas.txt");
            String stFinanzas = paFinanzas.toString();

            //Ruta Archivo Marketing
            Path paMarketing = Path.of("src", "Tema1", "Ejercicio7", "marketing.txt");
            String stMarketing = paMarketing.toString();

            //Ruta Archivo Personal
            Path paPersonal = Path.of("src", "Tema1", "Ejercicio7", "personal.txt");
            String stPersonal = paPersonal.toString();

            //Ruta Archivo Sistemas
            Path paSistemas = Path.of("src", "Tema1", "Ejercicio7", "sistemas.txt");
            String stSistemas = paSistemas.toString();

            //Ruta Archivo Ventas
            Path paVentas = Path.of("src", "Tema1", "Ejercicio7", "ventas.txt");
            String stVentas = paVentas.toString();


            ProcessBuilder pb1 =  new ProcessBuilder("java", "-cp", "out/production/PSP", "Tema1.EjerciciosRA1.Ejercicio7.ProcesoHijo", stFinanzas);
            Process p1 = pb1.start();
            try (BufferedReader br1 = new BufferedReader(new InputStreamReader(p1.getInputStream()))) {
                String line;
                while ((line = br1.readLine()) != null) {
                    System.out.println("linea: " + line);
                    listaNumeros.add(line);
                }
            }  catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }


            ProcessBuilder pb2 =  new ProcessBuilder("java", "-cp", "out/production/PSP", "Tema1.EjerciciosRA1.Ejercicio7.ProcesoHijo", stMarketing);
            Process p2 = pb2.start();
            try (BufferedReader br2 = new BufferedReader(new InputStreamReader(p2.getInputStream()))) {
                String line;
                while ((line = br2.readLine()) != null) {
                    System.out.println("linea: " + line);
                    listaNumeros.add(line);
                }
            }  catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

            ProcessBuilder pb3 =  new ProcessBuilder("java", "-cp", "out/production/PSP", "Tema1.EjerciciosRA1.Ejercicio7.ProcesoHijo", stPersonal);
            Process p3 = pb3.start();


            try (BufferedReader br3 = new BufferedReader(new InputStreamReader(p3.getInputStream()))) {
                String line;
                while ((line = br3.readLine()) != null) {
                    System.out.println("linea: " + line);
                    listaNumeros.add(line);
                }
            }  catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

            ProcessBuilder pb4 =  new ProcessBuilder("java", "-cp", "out/production/PSP", "Tema1.EjerciciosRA1.Ejercicio7.ProcesoHijo", stSistemas);
            Process p4 = pb4.start();

            try (BufferedReader br4 = new BufferedReader(new InputStreamReader(p4.getInputStream()))) {
                String line;
                while ((line = br4.readLine()) != null) {
                    System.out.println("linea: " + line);
                    listaNumeros.add(line);
                }
            }  catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

            ProcessBuilder pb5 =  new ProcessBuilder("java", "-cp", "out/production/PSP", "Tema1.EjerciciosRA1.Ejercicio7.ProcesoHijo", stVentas);
            Process p5 = pb5.start();


            try (BufferedReader br5 = new BufferedReader(new InputStreamReader(p5.getInputStream()))) {
                String line;
                while ((line = br5.readLine()) != null) {
                    System.out.println("linea: " + line);
                    listaNumeros.add(line);
                }
            }  catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

            int exitcode1 = p1.waitFor();
            int exitcode2 = p2.waitFor();
            int exitcode3 = p3.waitFor();
            int exitcode4 = p4.waitFor();
            int exitcode5 = p5.waitFor();
            int total = 0;
            for (String s : listaNumeros) {
                total += Integer.parseInt(s);
            }

            System.out.println("total: " + total);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
