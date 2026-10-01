import  java.util.Scanner;
import java.util.ArrayList;

public class EstructuraDatosS3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;
        ArrayList<Integer> interseccion = new ArrayList<>();

        System.out.print("Códigos de Modelos en Descuento en Sede Norte: ");
        int n = sc.nextInt();

        System.out.print("Códigos de Modelos en Descuento en Sede Centro: ");
        int c = sc.nextInt();

        while (n <= 0 || c <= 0) {
            System.out.println("Numero Invalido ");
            n = sc.nextInt();
            c = sc.nextInt();
        }

        int[] codigoModelosSedeNorte = new int[n];
        int[] codigoModelosSedeCentro = new int[c];

        for (int i = 0; i < n; i++) {
            System.out.print("Código de Modelo " + (i + 1) + " Sede Norte: ");
            codigoModelosSedeNorte[i] = sc.nextInt();
        }
        for (int j = 0; j < c; j++) {
            System.out.print("Código de Modelo " + (j + 1) + " Sede Centro: ");
            codigoModelosSedeCentro[j] = sc.nextInt();
        }

        for (int i = 0; i < codigoModelosSedeNorte.length; i++) {
            for (int j = 0; j < codigoModelosSedeCentro.length; j++) {
                if (codigoModelosSedeNorte[i] == codigoModelosSedeCentro[j]) {
                    interseccion.add(codigoModelosSedeNorte[i]) ;
                }
            }
        }

        if (interseccion.isEmpty()) {
            System.out.println("No Existe Intersección.");
        } else {
            System.out.println("Modelos en Descuento en Ambas Sedes: ");
            for (int i = 0; i < interseccion.size(); i++) {
                System.out.println(interseccion.get(i));
            }
        }

        sc.close();
    }
}
