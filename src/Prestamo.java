import java.util.Scanner;

public class Prestamo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Monto del Préstamo: ");
        double monto = sc.nextDouble();


        System.out.print("Tasa de interés mensual: ");
        double tasa = sc.nextDouble();
        double r = tasa / 100;

        System.out.print("Numero de cuotas: ");
        int cuotas =sc.nextInt();

        double cuotamen = (monto * r) / (1 - Math.pow(1 + r, -cuotas));
        System.out.println("Cuota Mensual: " + String.format("%.2f", cuotamen));

        double totalpag = cuotamen * cuotas;
        System.out.println("Total a Pagar: " + String.format("%.2f", totalpag));

        double totalint = totalpag - monto;
        System.out.println("Total interés: " + String.format("%.2f", totalint));

        if (totalint > monto * 0.40) {
            System.out.println("Préstamo Costoso, Considera reducir el plazo. ");
        } else {
            System.out.println("Préstamo Razonable. ");
        }
sc.close();
    }
}
