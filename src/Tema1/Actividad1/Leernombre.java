package Tema1.Actividad1;

import java.util.regex.Pattern;

public class LeerNombre {
    public static void main(String[] args) {

        String name = args[0];

        boolean output = Pattern.matches("[a-zA-Z ]+", name);

        if (output) {
            System.out.println("Si");
            System.exit(0);
        } else {
            System.out.println("No");
            System.exit(-1);
        }
    }
}
