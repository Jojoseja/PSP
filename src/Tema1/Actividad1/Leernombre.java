package Tema1.Actividad1;

public class Leernombre {
    public static void main(String[] args) {
        try {
            Process p = Runtime.getRuntime().exec("java -cp out/production/PSP Tema1.Actividad1.LeerNombre hola");

            /*
            InputStreamReader isr = new InputStreamReader(p.getInputStream());

            BufferedReader br = new BufferedReader(isr);

            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

            br.close();
            */
            System.out.println(p.waitFor());

            System.out.println(p.exitValue());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
