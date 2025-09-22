package Tema1.Actividad3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GenerarSuma {
    public static void main(String[] args) {
        try {
            Process p = Runtime.getRuntime().exec("java -cp out/production/PSP Tema1.Actividad3.SumaNumeros");
            InputStreamReader isr = new InputStreamReader(p.getInputStream());

            BufferedReader br = new BufferedReader(isr);

            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

            br.close();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
