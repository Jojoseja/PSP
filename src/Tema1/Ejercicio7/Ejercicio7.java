package Tema1.Ejercicio7;

import java.util.ArrayList;

public class Ejercicio7 {
    public static void main(String[] args) {
        try {
            ArrayList<String> listaNumeros = new ArrayList<>();
            ProcessBuilder pb1 =  new ProcessBuilder("java", "-cp", "out/production/PSP", "Tema1.Ejercicio7", "finanzas.txt");
            Process p1 = pb1.start();
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
