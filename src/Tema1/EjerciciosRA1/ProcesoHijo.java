package Tema1.EjerciciosRA1;

public class ProcesoHijo{
    public static void main(String[] args) {
        try {
            double num = Double.valueOf(args[0]);
            System.out.println(num*2);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
