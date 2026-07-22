import java.util.Scanner;

public class Nota_Promedio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuantas materias tienes?: ");
        int materias = sc.nextInt();

        double suma = 0;
        for (int i = 1; i <= materias; i++ ){
            System.out.print("Nota materia " + i + ": ");
            double nota = sc.nextDouble();
            suma = suma + nota;
        }

        double promedio = suma / materias;
        System.out.println("Tu promedio es de: " + String.format("%.2f", promedio));

        if (promedio >= 4.5) {
            System.out.println("¡Excelente Semestre!");
        } else if (promedio >= 3.0) {
            System.out.println("¡Buen Semestre, Sigue asi!");
        } else {
            System.out.println("¡Semestre difícil, esfuérzate mas! ");
        }
sc.close();
    }
}
