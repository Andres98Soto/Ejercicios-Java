import java.util.Scanner;

public class Ganancias_Inversion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Capital Inicial: ");
        double P = sc.nextDouble();

        System.out.println("Tasa de interés mensual: ");
        double tasa = sc.nextDouble();
        double r = tasa / 100;

        System.out.println("Meses de inversion: ");
        int n = sc.nextInt();

        double montoFin = P * Math.pow(1 + r, n);
        System.out.println("Monto final: " + String.format("%.2f", montoFin));

        double ganancia = montoFin - P;
        System.out.println("Ganancias: " + String.format("%.2f", ganancia));

        if (ganancia > P * 0.50) {
            System.out.println("¡Excelente Inversion! ");
        } else if (ganancia >= P * 0.20 ) {
            System.out.println("Rentabilidad moderada. ");
        } else  {
            System.out.println("Rentabilidad baja. ");
        }
sc.close();
    }
}
