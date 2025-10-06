package Tema1.EjerciciosRA1;

import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt(args[0]);
            //Placeholder num = 0
            if (num == 0) {
                System.out.println("0");
            } else if (num == 1){
                System.out.println("1");
            } else {
                ArrayList<Integer> divisores = new ArrayList<>();
                for (int i = num; i > 1; i--){
                    if (num % i == 0) {
                        divisores.add(i);
                    }
                }
                System.out.println("Total de Divisores: " + divisores.size() + divisores);
            }


        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Se requiere de 1 argumento");
        } catch (NumberFormatException e) {
            System.out.println("Argumento invalido, introduce un INT");
        } catch (Exception e) {
            System.out.println(e + e.getMessage());
        }
    }
}
