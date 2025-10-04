package Tema1.Ejercicio7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Path;


//Esta clase sirve para devolver la suma de los numeros de un documento que se pase como parámetro
public class ProcesoHijo {
    public static void main(String[] args) {
        //Este proceso va a recibir como argumento el nombre del archivo a abrir
        String archivo = args[0];
        String fileType = ".txt";

        String lastVar = archivo + fileType;

        Path path = Path.of("src", "Tema1", "Ejercicio7", lastVar);
        File file = path.toFile();

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
