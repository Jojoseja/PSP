package Repaso;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tabla1 =  {0,1,2,3,4,5,6,7,8,9};
        int[] tabla2 = {10,11,12,13,14,15,16,17,18,19};

        int[] tabla3 = new int[20];

        int counter = 0;
        for (int i = 0; i < tabla1.length; i++) {
            tabla3[counter] = tabla1[i];
            counter++;
            tabla3[counter] = tabla2[i];
            counter++;
        }
        for (int i = 0; i < tabla3.length; i++) {
            System.out.println(tabla3[i]);
        }
    }
}
