import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa Tu Nota: ");
        int nota = sc.nextInt();

        System.out.print("Calificación: ");

        if (nota < 0 || nota > 100) {
            System.out.println("Nota Invalida");
        } else if (nota >= 90 ) {
            System.out.println("Excelente");
        } else if (nota >= 75) {
            System.out.println("Bueno");
        } else if (nota >= 60) {
            System.out.println("Suficiente");
        } else {
            System.out.println("Reprobado");
        }
        sc.close();
    }
}
