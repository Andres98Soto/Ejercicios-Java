import java.util.Scanner;
public class Velocidad {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Distancia Recorrida: ");
        double distancia = sc.nextDouble();

        System.out.print("Tiempo Empleado: ");
        double tiempo = sc.nextDouble();

        double velprom = distancia / tiempo;
        System.out.println("Tu Velocidad promedio es: " + String.format("%.2f", velprom));

        if (velprom > 80 ) {
            System.out.println("¡Cuidado! Estas por encima del limite recomendado. ");
        } else if (velprom >= 60 ) {
            System.out.println("Velocidad adecuada. ¡Maneja seguro! ");
        } else {
            System.out.println("Velocidad baja. ¿Todo bien? ");
        }
        sc.close();
    }
}
