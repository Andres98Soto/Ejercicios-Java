import java.util.Scanner;

public class Matrices1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuantos Estudiantes vas a Calificar?: ");
        int e = sc.nextInt();
        sc.nextLine();

        System.out.print("¿Cuantas Materias?: ");
        int m = sc.nextInt();
        sc.nextLine();

        while (e <= 0 || m <= 0) {
            System.out.println("Invalido, Intente de Nuevo ");
            e = sc.nextInt();
            m = sc.nextInt();
            sc.nextLine();
        }

        String[] nombreEstudiantes = new String[e];
        String[] nombreMaterias = new String[m];
        double[][] notas = new double[e][m];

        for (int i = 0; i < e; i++) {
            System.out.print("Estudiante " + (i + 1) + ": " );
            nombreEstudiantes[i] = sc.nextLine();
        }

        for (int j = 0; j < m; j++) {
            System.out.print("Materia " + (j + 1) + ": ");
            nombreMaterias[j] = sc.nextLine();
        }

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print("Nota de " + nombreEstudiantes[i] + " en " + nombreMaterias[j] + ": ");
                notas[i][j] = sc.nextDouble();
            }
        }

        System.out.print(String.format("%-20s", ""));
        for (int j = 0; j < m; j++) {
            System.out.print(String.format("%-20s", nombreMaterias[j]));
        }
        System.out.println();

        double[] promedios = new double[e];
        double sumaTotal = 0;

        for (int i = 0; i < e; i++) {
            double sumaFila = 0;
            System.out.print(String.format("%-20s", nombreEstudiantes[i]));
            for (int j = 0; j < m; j++) {
                sumaFila += notas[i][j];
                sumaTotal += notas[i][j];
                System.out.print(String.format("%-20.1f", notas[i][j]));
            }
            promedios[i] = sumaFila / m;
            System.out.println();
        }
        for (int i = 0; i < e; i++) {
            System.out.println("Promedio de " + nombreEstudiantes[i] + ": " + String.format("%.1f", promedios[i]));
        }

        System.out.println("Suma Total: " + String.format("%.1f", sumaTotal));

        double[] sumaColumnas = new double[m];

        for (int i = 0; i < e; i++) {
            for (int j = 0; j < m; j++) {
                sumaColumnas[j] += notas[i][j];
            }
        }

        for (int j = 0; j < m; j++) {
            double promedioMateria = sumaColumnas[j] / e;
            System.out.println("Promedio de " + nombreMaterias[j] + ": " + String.format("%.1f", promedioMateria));
        }

        sc.close();
    }
}