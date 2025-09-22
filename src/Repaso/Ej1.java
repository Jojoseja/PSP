package Repaso;

import java.util.Scanner;

//Leer 5 números y mostrarlos en el mismo orden introducido.

public class Ej1 {
    public static void main(String[] args) {

        //array de tamaño 5 de tipo int
        int[] listaNumeros = new int[5];

        //Objeto Scanner
        Scanner sc = new Scanner(System.in);

        //Loop para Introducir los datos
        int counter = 0;
        while (true) {
            try {
                //Salir del loop cuando se escriba el 5nto elemento
                if (counter == 5) {
                    break;
                }
                //Agregar numero al array, en caso de no dar error incrementar el contador
                listaNumeros[counter] = sc.nextInt();
                counter++;

            } catch (Exception e) {
                //Manejar la excepcion
                System.out.println("Introduce un numero válido");
                sc.next();
            }
        }
        //Imprimir por pantalla los números introducidos
        for (int i = 0; i < listaNumeros.length; i++) {
            System.out.println(listaNumeros[i]);
        }

    }
}
