package Tema1.EjerciciosRA1.Ejercicio7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


//Esta clase sirve para devolver la suma de los numeros de un documento que se pase como parámetro
public class ProcesoHijo {
    public static void main(String[] args) {
        //Este proceso va a recibir como argumento el nombre del archivo a abrir
        String route = args[0];


        File file = new File(route);

        int contador = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                contador+=Integer.parseInt(line);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(contador);
    }
}
