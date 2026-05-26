import java.util.Scanner;

public class Ejercicio3 {
    public static void main (String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.print("Ingresa el precio del Producto: ");
        double precio = sc.nextDouble();

        System.out.println("Categoria:");
        System.out.print("1: VIP, 2: Frecuente, 3: Regular: ");
        int opcion = sc.nextInt();

        if (opcion == 1) {
            double precioFinal = precio * 0.75 ;
            System.out.println("Descuento del 25% ");
            System.out.print("Precio con Descuento: " + precioFinal );
        } else if (opcion == 2) {
            double precioFinal = precio * 0.90 ;
            System.out.println("Descuento del 10% ");
            System.out.print("Precio con Descuento: " + precioFinal);
        } else if (opcion == 3) {
            double precioFinal = precio;
           System.out.println("Sin Descuento ");
            System.out.print("Precio con Descuento: " + precio);
        } else {
            System.out.print("Categoria Invalida");
        }
        sc.close();

    }
}
