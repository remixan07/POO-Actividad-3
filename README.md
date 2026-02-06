# POO-Actividad-3

## ----------------------
## ----- Versión 1 ------
## ----------------------
Utilicé únicamente variables sueltas para manejar los datos de los productos

No existe una clase que represente al producto ni métodos para el cálculo del precio

Usé String y double para cada producto

El cálculo del precio lo realizé directamente en main

No se manejó impuesto real

## ----------------------
## ----- Versión 2 ------
## ----------------------
Apliqué orientación a objetos para mejorar organización y representar entidades reales

Introduje "producto" como una variable

Creé la clase "producto"

Almacené descripción y costo dentro del objeto

Comparé los productos mediante sus atributos

=== Añadí: ===

class Producto {

    String descripcion;
    
    double costo;
    
}

=== Modifiqué: ===

String d1;

=== por: ===

Producto p1 = new Producto();

## ----------------------
## ----- Versión 3 ------
## ----------------------
Pasé los atributos a private

Agregué setters y getter

Creé el método calcularPrecio e incorporé el impuesto

Dejé de hacer el cálculo en main

=== Añadí: ===

public double calcularPrecio(double utilidad)

=== Modifiqué: ===

double costo;

=== por: ===

private double costo

=== y ===

p1.costo

=== pot: ===

p1.setCosto

## ----------------------
## ----- Versión 4 ------
## ----------------------
Agregué nuevos atributos al producto y separé la comparación

Añadí codigo y tipo

Creé el método compararProductos

=== Modifiqué: ===

private String codigo;

private String tipo;

=== Por: ===

static String compararProductos

## ----------------------
## ----- Versión 5 ------
## ----------------------
Mejoré la salida del programa y agregué mensajes intermedios

Agregué el mensaje previo a la comparación

Reforzé el uso de try / catch

Mejoré la claridad de la salida

=== Añadí: ===

System.out.println("Mayor precio:");

## ----------------------
## ----- Versión 6 ------
## ----------------------
Añadí presentación de datos desde la clase Producto

Creé el método mostrarProducto

Imprimí los productos desde el objeto.

Completé la estructura del programa

=== Añadí: ===

public void mostrarProducto()


p1.mostrarProducto();

p2.mostrarProducto();
