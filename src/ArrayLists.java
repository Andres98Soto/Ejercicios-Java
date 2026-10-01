import java.util.Scanner;
import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> listaDeseos = new ArrayList<>();

        System.out.print("¿Cuantos Códigos vas a Ingresar? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Código " + (i+1) + ": ");
            int codigo = sc.nextInt();
            listaDeseos.add(codigo);
        }

        for (Integer codigo : listaDeseos) {
            System.out.println(codigo);
        }

        System.out.print("¿Que Código Quieres Verificar? ");
        int codigoBuscado = sc.nextInt();

        if (listaDeseos.contains(codigoBuscado)) {
            System.out.println("Ese Modelo ya está en tu lista de Deseos. ");
        } else {
            System.out.println("Ese Modelo no esta en tu Lista. ");
        }

        System.out.print("¿Que posición quieres reemplazar? ");
        int posicion = sc.nextInt();

        if (posicion >= 0 && posicion < listaDeseos.size()) {
            System.out.print("Nuevo código para esa posición: ");
            int nuevoCodigo = sc.nextInt();
            listaDeseos.set(posicion, nuevoCodigo);
            System.out.println("Actualizado. ");
        } else {
            System.out.println("Esa posición no Existe. ");
        }

        System.out.print("¿Que Código quieres Eliminar? ");
        int codigoAEliminar = sc.nextInt();

        if (listaDeseos.contains(codigoAEliminar)) {
            listaDeseos.remove(Integer.valueOf(codigoAEliminar)) ;
            System.out.println("Eliminado. ");
        } else {
            System.out.println("Ese Código no esta en la Lista. ");
        }

        if (listaDeseos.isEmpty()) {
            System.out.println("Tu lista de Deseos esta Vacía. ");
        } else {
            System.out.println("Te Quedan " + listaDeseos.size() + " Modelos en tu Lista de Deseos. " + listaDeseos);
        }

        sc.close();
    }
}
