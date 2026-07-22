import java.util.Scanner;

public class Arreglo2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuantos Nombres Vas a Ingresar?: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] nombres = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nombre " + (i + 1) + ": ");
            nombres[i] = sc.nextLine();
        }

        System.out.println("Lista de Nombres: ");

        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". " + nombres[i]);
        }

        sc.close();

    }
}
