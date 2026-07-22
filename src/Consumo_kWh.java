import java.util.Scanner;

public class Consumo_kWh {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Estrato : ");
        System.out.println("1: Estrato 1, 2: Estrato 2, 3: Estrato 3, 4: Estrato 4, 5: Estrato 5, 6: Estrato 6");
        int estrato = sc.nextInt();

        System.out.println("Consumo de kWh: ");
        int consumo = sc.nextInt();

        double precioxkWh = 0;

        if (estrato == 1 || estrato == 2){
            precioxkWh = 400;
        } else if (estrato == 3 || estrato == 4) {
            precioxkWh = 600;
        } else if (estrato == 5 || estrato == 6) {
            precioxkWh = 900;
        } else {
            System.out.println("Opción Invalida. ");
        }
        double subTotal = consumo * precioxkWh;
        System.out.println("Subtotal: " + String.format("%.2f", subTotal));

        double total;

        if (consumo > 300) {
            double recargo = subTotal * 0.15;
            System.out.println("Recargo 15%: " + String.format("%.2f", recargo));
            total = subTotal + recargo;
        } else if (consumo < 100) {
            double descuento = subTotal * 0.10;
            System.out.println("Descuento 10%: " + String.format("%.2f", descuento));
            total = subTotal - descuento;
        } else {
            total = subTotal;
        }
        System.out.println("Total a pagar: " + String.format("%.2f", total));

        sc.close();
    }
}
