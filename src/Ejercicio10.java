import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nota;
        do {
            System.out.print("Ingresa tu Nota (0 a 100): ");
           nota = sc.nextInt();
           if (nota < 0 || nota > 100) {
               System.out.println("Nota Invalida. Intenta de nuevo.");
           }
        } while (nota < 0 || nota > 100);


        System.out.print("Clasificación: ");

            if (nota >= 90) {
                System.out.println("Excelente ");
            } else if (nota >= 75) {
                System.out.println("Bueno ");
            } else if (nota >= 60) {
                System.out.println("Aprobado ");
            } else {
                System.out.println("Reprobado");
            }

        sc.close();
    }

}
