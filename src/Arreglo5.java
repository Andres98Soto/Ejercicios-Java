import java.util.Scanner;

public class Arreglo5 {
    public static void main(String[] args) {

        double[] precios = {8500, 12300, 4200, 25000, 15600, 3800, 9900};
        double suma = 0;

        double maximo = precios[0];
        double minimo = precios[0];

        for (int i = 0; i < precios.length; i++) {
            suma = suma + precios[i];
            if (precios[i] > maximo) {
                maximo = precios[i];
            }

            if (precios[i] < minimo) {
                minimo = precios[i];
            }

    }
        System.out.println("Precio Mas Alto: " + String.format("%.2f", maximo));
        System.out.println("Precio Mas Bajo: " + String.format("%.2f", minimo));

        double promedio = suma / precios.length;
        System.out.println("Promedio: " + String.format("%.2f", promedio));

        int contador = 0;

        for (int i = 0; i < precios.length; i++) {
            if (precios[i] < promedio) {
                contador ++;
            }
        }
        System.out.println("Productos bajo el promedio: " + contador);

    }
    }
