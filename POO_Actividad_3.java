import java.util.Scanner;

class Producto {

    private String descripcion;
    private double costo;
    private double impuesto;

    public void setDescripcion(String x) {
        descripcion = x;
    }

    public void setCosto(double x) {
        costo = x;
    }

    public void setImpuesto(double x) {
        impuesto = x;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double calcularPrecio(double utilidad) {

        double base = costo + (costo * utilidad);
        return base + (base * impuesto);
    }
}

public class POO_Actividad_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Producto a = new Producto();
        Producto b = new Producto();

        a.setDescripcion(sc.nextLine());

        try {
            a.setCosto(Double.parseDouble(sc.nextLine()));
        } catch (Exception e) {
            a.setCosto(0);
        }

        a.setImpuesto(.16);

        b.setDescripcion(sc.nextLine());

        try {
            b.setCosto(Double.parseDouble(sc.nextLine()));
        } catch (Exception e) {
            b.setCosto(0);
        }

        b.setImpuesto(.16);

        double pa = a.calcularPrecio(.20);
        double pb = b.calcularPrecio(.20);

        if (pa > pb) {
            System.out.println(a.getDescripcion());
        } else {
            System.out.println(b.getDescripcion());
        }

        sc.close();
    }
}