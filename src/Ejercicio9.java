import java.util.Scanner;
import java.util.Random;

public class Ejercicio9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Adivina el Número secreto (Entre 1 y 100): ");
        Random rand = new Random();
        int numSecret = rand.nextInt(100) + 1;


        int intento = sc.nextInt();
        while (intento < 1 || intento > 100) {
            System.out.println("Número Invalido. Ingresa un número entre 1 y 100");
            intento = sc.nextInt();

        }
        int intentos = 0;
        while (intento != numSecret) {
            if (intento > numSecret) {
                System.out.println("Muy Alto, Intenta de Nuevo ");
            } else {
                System.out.println("Muy Bajo, Intenta de Nuevo ");
            }
            intento = sc.nextInt();
            intentos++;
        }
        System.out.println("¡Correcto! Lo lograste en " + intentos + " intentos. " );

        sc.close();
    }
}
