package Repaso;

//Leer por teclado dos tablas de 10 números enteros y mezclarlas en una tercera de la
//forma: el 1º de A, el 1º de B, el 2º de A, el 2º de B, etc.

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        //Tamaño del array
        int size = 10;

        int[] array1 = crearArray(size);
        int[] array2 = crearArray(size);

        //Array producto de mezclar ambas
        int[] tabla3 = new int[20];

        int counter = 0;
        for (int i = 0; i < size; i++) {
            tabla3[counter] = array1[i];
            counter++;
            tabla3[counter] = array2[i];
            counter++;
        }
        for (int i = 0; i < tabla3.length; i++) {
            System.out.println(tabla3[i]);
        }
    }
    public static int[] crearArray(int size) {
        // Array que se devolverá
        int[] array = new int[size];

        //Objeto Scanner para introducir datos por teclado
        Scanner sc = new Scanner(System.in);

        //Loop para Introducir los datos
        int counter = 0;
        while (true) {
            try {
                //Salir del loop cuando se escriba el 5nto elemento
                if (counter == size) {
                    break;
                }
                //Agregar numero al array, en caso de no dar error incrementar el contador
                System.out.print("Introduce un número para el array: ");
                array[counter] = sc.nextInt();
                counter++;

            } catch (Exception e) {
                //Manejar la excepcion
                System.out.println("Introduce un numero válido");
                sc.next();
            }
        }
        System.out.println("El array está completo");
        return array;
    }
}
