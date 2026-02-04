import java.util.Scanner;

class Producto {

    String descripcion;
    double costo;

}

public class POO_Actividad_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //S-a REBISA TUS NOTAS

        Producto p1 = new Producto();
        Producto p2 = new Producto();

        p1.descripcion = sc.nextLine();

        try {
            p1.costo = Double.parseDouble(sc.nextLine());
        } catch (Exception e) {
            p1.costo = 0;
        }

        p2.descripcion = sc.nextLine();

        try {
            p2.costo = Double.parseDouble(sc.nextLine());
        } catch (Exception e) {
            p2.costo = 0;
        }

        if (p1.costo > p2.costo) {
            System.out.println(p1.descripcion);
        } else {
            System.out.println(p2.descripcion);
        }

        sc.close();
    }
}