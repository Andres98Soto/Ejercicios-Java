import java.util.Scanner;

public class Quema_calorias {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuanto pesas? ");
        double peso = sc.nextDouble();

        System.out.println("¿Cuanto tiempo haces ejercicio? ");
        double tiempo = sc.nextDouble();
        double hora = tiempo / 60;

        System.out.println("Elige una actividad: ");
        System.out.println("1: Caminar, 2: Trotar, 3: Ciclismo, 4: Natación");
        int opcion = sc.nextInt();

        double MET = 0;

        if (opcion == 1){
             MET = 3.5;
        } else if (opcion == 2) {
             MET = 7.0;
        } else if (opcion == 3) {
             MET = 8.0;
        } else if (opcion == 4) {
             MET = 9.0;
        } else {
            System.out.println("Opción no Valida. ");
            return;
        }

        double calorias = MET * peso * hora;
        System.out.println("Calorías Quemadas: " + String.format("%.2f", calorias));

        if (calorias > 500) {
            System.out.println("¡Entrenamiento Intenso! ");
        } else {
            System.out.println("¡Buen esfuerzo, sigue asi! ");
        }
           sc.close();

        }
}

