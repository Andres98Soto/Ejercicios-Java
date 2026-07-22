import java.util.Scanner;

public class Arreglo1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuantos Gastos Tuviste En Este Mes?: ");
        int n = sc.nextInt();

        double[] gastos = new double[n];

        double suma = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Gasto " + (i + 1) + ": " );
            gastos[i] = sc.nextDouble();
            suma = suma + gastos[i];
        }
        double promedio = suma / n;
        System.out.println("Total: " + String.format("%.2f", suma));
        System.out.println("Promedio: " + String.format("%.2f", promedio));

        int contador = 0;

        for (int i = 0; i < n; i++) {
            if (gastos[i] > promedio) {
                contador++;
            }
        }

        System.out.println("Gastos por encima del promedio: " + contador);

        if (contador > n / 2) {
            System.out.println("Tus gastos están muy desbalanceados. ");
        } else {
            System.out.println("Tus gastos están bien distribuidos. ");
        }

        sc.close();

    }
}

