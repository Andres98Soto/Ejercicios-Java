import java.util.Scanner;

public class Arreglo3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuanto Números Vas a Ingresar?: ");
        int n = sc.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        int mayor = numeros[0];
        int menor = numeros[0];

        for (int i = 0; i < n; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }

            if (numeros [i] < menor) {
                menor = numeros[i];
            }

        }

        System.out.println("El Numero Mayor es: " + mayor);
        System.out.println("El Numero Menor es: " + menor);

        sc.close();

    }
}

