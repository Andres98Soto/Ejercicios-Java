import java.util.Scanner;

public class Ejercicio6 {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuantos números quieres sumar?: ");
        int cantidad = sc.nextInt();

        int suma = 0;
        for (int i = 1; i <= cantidad; i++ ) {
            System.out.print("Ingresa el numero " + i + ": ");
            int numero = sc.nextInt();
            suma = suma + numero;

        }
        System.out.println("La suma total es: " + suma );
        sc.close();

    }
}
