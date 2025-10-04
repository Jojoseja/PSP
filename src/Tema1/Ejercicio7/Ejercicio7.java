package Tema1.Ejercicio7;
import java.nio.file.Path;
import java.util.ArrayList;

public class Ejercicio7 {
    public static void main(String[] args) {
        try {
            ArrayList<String> listaNumeros = new ArrayList<>();
            //Ruta Archivo Finanzas
            Path paFinanzas = Path.of("src", "Tema1", "Ejercicio7", "finanzas.txt");
            String stFinanzas = paFinanzas.toString();

            ProcessBuilder pb1 =  new ProcessBuilder("java", "-cp", "out/production/PSP", "Tema1.Ejercicio7", stFinanzas);
            Process p1 = pb1.start();
            System.out.println(p1.getInputStream().toString());
            listaNumeros.add(p1.getInputStream().toString());
            int exitcode = p1.waitFor();
            System.out.println(exitcode);


            int total = 0;
            for (String s : listaNumeros) {
                total += Integer.parseInt(s);
            }
            System.out.println(total);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
