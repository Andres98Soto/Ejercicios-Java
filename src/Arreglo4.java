import java.util.Scanner;
import java.util.Arrays;

public class Arreglo4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuanto Números Vas a Ingresar?: ");
        int n = sc.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        Arrays.sort(numeros);

        System.out.println("Lista Ordenada: ");

        for (int i = 0; i < n; i++) {
            if (i < n - 1) {
                System.out.print(numeros[i] + ", ");
            } else {
                System.out.print(numeros[i]);
            }
        }
    }
}
