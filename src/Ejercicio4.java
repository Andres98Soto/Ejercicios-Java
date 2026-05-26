import java.util.Scanner;

public class Ejercicio4 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tu Peso (kg): ");
        double peso = sc.nextDouble();

        System.out.print("Ingresa tu Altura (m): ");
        double altura = sc.nextDouble();

        double IMC = peso / (altura * altura);
        System.out.println("Tu IMC es: " + String.format("%.2f", IMC));

        System.out.print("Clasificación: ");

        if (IMC >= 30.0){
            System.out.println("Obesidad");
        } else if (IMC >= 25.0) {
            System.out.println("Sobrepeso");
        } else if (IMC >=18.5) {
            System.out.println("Peso Normal");
        } else {
            System.out.println("Bajo Peso");
        }
        sc.close();
    }
}
