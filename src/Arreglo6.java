import java.util.Scanner;

public class Arreglo6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuantos Estudiantes vas a Calificar?: ");
        int n = sc.nextInt();
        sc.nextLine();

        while (n <= 0) {
        System.out.println("Numero Invalido, Intente de Nuevo ");
        n = sc.nextInt();
        sc.nextLine();
    }
        String[] nombres = new String[n];
        double[] notas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Estudiante " + (i + 1) + ": ");
            nombres[i] = sc.nextLine();

            System.out.print("Nota de " + nombres[i] + ": ");
            notas[i] = sc.nextDouble();
            sc.nextLine();
        }

        double suma = 0;
        int aprobados = 0;
        int reprobados = 0;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 3.0) {
                System.out.println(nombres[i] + ": Aprobado" );
                aprobados++;

            } else if (notas[i] < 3.0) {
                System.out.println(nombres[i] + ": Reprobado" );
                reprobados++;
            }

            suma = suma + notas[i];
        }

        System.out.println("Estudiantes Aprobados: " + aprobados);
        System.out.println("Estudiantes Reprobados: " + reprobados);
        System.out.print("Validación Institucional: ");
        if ((double) aprobados / n >= 0.70) {
            System.out.println("Curso Aprobado Institucionalmente");
        } else {
            System.out.println("El Curso necesita Refuerzo");
        }

        double promedio = suma / n;
        System.out.println("Promedio del Grupo: " + String.format("%.1f", promedio));

        double notaMasAlta = notas[0];
        double notaMasBaja = notas[0];
        int indiceMaX = 0;
        int indiceMin = 0;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > notaMasAlta) {
                notaMasAlta = notas[i];
                indiceMaX = i;}

            if (notas[i] < notaMasBaja) {
                notaMasBaja = notas[i];
                indiceMin = i;
            }
        }

        System.out.println("Nota mas Baja: " + nombres[indiceMin] + ", con: " + String.format("%.1f", notaMasBaja));
        System.out.println("Nota mas Alta: " + nombres[indiceMaX] + ", con: " + String.format("%.1f", notaMasAlta));

        sc.close();

    }
}
