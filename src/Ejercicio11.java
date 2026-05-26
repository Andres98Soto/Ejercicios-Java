import java.util.Scanner;
public class Ejercicio11 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("¿Cuantos Km piensas recorrer?");
        double km = sc.nextDouble();

        double litro = km / 40.0;
       System.out.println("Litros Necesarios: " + String.format("%.2f", litro));


        double costo = 9800 * litro;
       System.out.println("Costo Total: " + String.format("%.2f", costo));

       if (costo > 100000 ) {
           System.out.println("Viaje Largo, Considera revisar tu presupuesto. ");
       } else {
           System.out.println("Viaje Económico. ¡Listo para Salir! ");
       }
sc.close();
    }
}
