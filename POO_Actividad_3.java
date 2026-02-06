import java.util.Scanner;

class Producto {

    private String descripcion;
    private String codigo;
    private String tipo;
    private double costo;
    private double impuesto;

    public void setDescripcion(String x) {
        descripcion = x;
    }

    public void setCodigo(String x) {
        codigo = x;
    }

    public void setTipo(String x) {
        tipo = x;
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

    public void mostrarProducto() {
        System.out.println(descripcion + " | " + codigo + " | " + tipo + " | " + costo);
    }

    public double calcularPrecio(double utilidad) {

        double base = costo + (costo * utilidad);
        return base + (base * impuesto);
    }
}

public class POO_Actividad_3 {

    static String compararProductos(Producto a, Producto b) {

        if (a.calcularPrecio(.20) > b.calcularPrecio(.20)) {
            return a.getDescripcion();
        } else {
            return b.getDescripcion();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Producto p1 = new Producto();
        Producto p2 = new Producto();

        p1.setDescripcion(sc.nextLine());
        p1.setCodigo(sc.nextLine());
        p1.setTipo(sc.nextLine());

        try {
            p1.setCosto(Double.parseDouble(sc.nextLine()));
        } catch (Exception e) {
            p1.setCosto(0);
        }

        p1.setImpuesto(.16);

        p2.setDescripcion(sc.nextLine());
        p2.setCodigo(sc.nextLine());
        p2.setTipo(sc.nextLine());

        try {
            p2.setCosto(Double.parseDouble(sc.nextLine()));
        } catch (Exception e) {
            p2.setCosto(0);
        }

        p2.setImpuesto(.16);

        p1.mostrarProducto();
        p2.mostrarProducto();

        System.out.println("Mayor precio:");
        System.out.println(compararProductos(p1, p2));

        sc.close();
    }
}
