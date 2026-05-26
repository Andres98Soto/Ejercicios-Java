import java.util.Scanner;

public class Ejercicio1 {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        int continuar = 1;

        while (continuar == 1) {


            System.out.print("Dime dos números: ");
            double num_1 = sc.nextDouble();
            double num_2 = sc.nextDouble();

            System.out.println("¿Que operación quieres utilizar? ");
            System.out.println("1: Suma, 2: Resta, 3: Multiplicación, 4: Division ");
            int opcion = sc.nextInt();

            if (opcion == 1) {
                double suma = num_1 + num_2;
                System.out.println("Resultado: " + suma);
            } else if (opcion == 2) {
                double resta = num_1 - num_2;
                System.out.println("Resultado: " + resta);
            } else if (opcion == 3) {
                double multiplicacion = num_1 * num_2;
                System.out.println("Resultado: " + multiplicacion);
            }else if (opcion == 4) {
                if (num_2 == 0) {
                    System.out.println("No se puede dividir por Cero");
                } else {
                    double division = num_1 / num_2;
                    System.out.println("Resultado: " + division);
                }

            } else {
                System.out.println("Opción Invalida");
            }
            System.out.println("¿Quieres continuar?  (1: si / 0: no):");
            continuar = sc.nextInt();

        }
        System.out.println("Programa Terminado");
    }
}
