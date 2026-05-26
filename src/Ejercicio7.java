import java.util.Scanner;

public class Ejercicio7 {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuantos números vas a ingresar?: " );
        int cantidad = sc.nextInt();

        System.out.print("Ingresa el numero 1: ");
        int mayor = sc.nextInt();
        int menor = mayor;

        for (int i = 2; i <= cantidad; i++) {
            System.out.print("Ingresa el numero " + i + ": ");
            int numero = sc.nextInt();

            if (numero > mayor) {
                mayor = numero;

            }
            if (numero < menor) {
                menor = numero;
            }

        }
        System.out.println(" ");
        System.out.println("El numero Mayor es: " + mayor);
        System.out.println("El numero Menor es: " + menor);

        sc.close();
    }
}
