import java.util.Scanner;

public class Matrices2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuantos Meses vas a Revisar?: ");
        int m = sc.nextInt();
        sc.nextLine();

        System.out.print("¿Cuantas Categorías?: ");
        int c = sc.nextInt();
        sc.nextLine();

        while (m <= 0 || c <= 0) {
            System.out.println("Invalido, Intente de Nuevo");
            m = sc.nextInt();
            c = sc.nextInt();
            sc.nextLine();
        }

        String[] nombreMes = new String[m];
        String[] nombreCate = new String[c];
        double[][] gastos = new double[m][c];

        for (int i = 0; i < m; i++) {
            System.out.print("Mes " + (i + 1) + ": ");
            nombreMes[i] = sc.nextLine();
        }

        for (int j = 0; j < c; j++) {
            System.out.print("Categoria " + (j + 1) + ": ");
            nombreCate[j] = sc.nextLine();
        }

        double[] presupuesto = new double[c];

        for (int j = 0; j < c; j++) {
            System.out.print("Presupuesto Maximo para " + nombreCate[j] + ": ");
            presupuesto[j] = sc.nextDouble();
            sc.nextLine();
        }

        for (int i = 0; i < gastos.length; i++){
            for (int j = 0; j < gastos[i].length; j++) {
                System.out.print("Gasto de " + nombreMes[i] + " en  " + nombreCate[j] + ": ");
                gastos[i][j] = sc.nextDouble();
                sc.nextLine();
            }
        }

        System.out.print(String.format("%-20s", ""));
        for (int j = 0; j < c; j++) {
            System.out.print(String.format("%-20s", nombreCate[j]));
        }
        System.out.println();

        double sumaTotal = 0;
        int contadorSobrecargos = 0;

        for (int i = 0; i < m; i++) {
            System.out.print(String.format("%-20s", nombreMes[i]));
            for (int j = 0; j < c; j++ ){
                sumaTotal += gastos[i][j];
                System.out.print(String.format("%-20.1f", gastos[i][j]));
            }
            System.out.println();
        }
        int[] sobregastosPorCategoria = new int[c];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < c; j++) {
                if (gastos[i][j] > presupuesto[j]) {
                    System.out.println("¡Cuidado! en " + nombreMes[i] + " Hubo Sobrecargo de " + (gastos[i][j] - presupuesto[j]) + " Pesos En: " + nombreCate[j]);
                    contadorSobrecargos++;
                    sobregastosPorCategoria[j]++;
                }
            }
        }

        System.out.println("Sobrecargos: " + contadorSobrecargos);

        if (contadorSobrecargos > 0) {
            int valorMasAlto = sobregastosPorCategoria[0];
            int indiceMasAlto = 0;

            for (int j = 0; j < c; j++) {
                if (sobregastosPorCategoria[j] > valorMasAlto) {
                    valorMasAlto = sobregastosPorCategoria[j];
                    indiceMasAlto = j;
                }
            }

            System.out.println("Categoria con mas Sobregastos: " + nombreCate[indiceMasAlto] + " (" + valorMasAlto + " veces)");
        } else {
            System.out.println("No Hubo Sobregastos en Ninguna Categoria. ");
        }

        sc.close();

    }
}
