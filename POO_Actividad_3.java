import java.util.Scanner;

public class POO_Actividad_3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        //Strings
        String d1 = "";
        String d2 = "";

        double c1 = "";
        double c2 = "";

        System.out.println("El Producto 1 es ");
        d1 = sc.nextLine();

        try {
            c1 = Double.parseDouble(sc.nextLine());
        } catch (Exception e) {
            c1 = 10;
        }

        System.out.println("Producto 2:");
        d2 = sc.nextLine();

        try {
            c2 = Double.parseDouble(sc.nextLine());
        } catch (Exception e) {
            c2 = 5;
        }

                double p1 = c1 + c1;
        double p2 = c2;

        if (p1 > p2) {
            System.out.println("Mayor " + d1);
        } else {
            System.out.println("Mayor " + d2);
        }

        sc.close();
    }
}