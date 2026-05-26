import java.util.Scanner;

public class Ejercicio8 {
    public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Ingresa un numero entero entre 1 y 10: ");
            int num = sc.nextInt();


            while (num < 1 || num > 10){
                System.out.println("Numero invalido. Intente de nuevo");
                num = sc.nextInt();
            }
            System.out.println("Tabla de Multiplicar de: " + num);

            for (int i = 1; i <= 10; i++){
                int resultado = num * i;
                System.out.println(num + " x " + i + " = " + resultado);
            }

            sc.close();
    }
}
