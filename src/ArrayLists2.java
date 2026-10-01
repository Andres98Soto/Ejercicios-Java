import java.util.Scanner;
import java.util.ArrayList;

public class ArrayLists2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> listaDeseos = new ArrayList<>();

        System.out.print("¿Cuantos Modelos vas a Ingresar? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Modelo " + (i+1) + ": ");
            String modelo = sc.nextLine();
            listaDeseos.add(modelo);
        }

        for (String modelo : listaDeseos) {
            System.out.println(modelo);
        }

        System.out.print("¿Que Modelo Quieres Verificar? ");
        String modeloBuscado = sc.nextLine();

        if (listaDeseos.contains(modeloBuscado)) {
            System.out.println("Ese Modelo ya está en tu lista de Deseos. ");
        } else {
            System.out.println("Ese Modelo no esta en tu Lista. ");
        }

        System.out.print("¿Que posición quieres reemplazar? ");
        int posicion = sc.nextInt();
        sc.nextLine();

        if (posicion >= 0 && posicion < listaDeseos.size()) {
            System.out.print("Nuevo modelo para esa posición: ");
            String nuevoModelo = sc.nextLine();
            listaDeseos.set(posicion, nuevoModelo);
            System.out.println("Actualizado. ");
        } else {
            System.out.println("Esa posición no Existe. ");
        }

        System.out.print("¿Que Modelo quieres Eliminar? ");
        String modeloAEliminar = sc.nextLine();

        if (listaDeseos.contains(modeloAEliminar)) {
            listaDeseos.remove(modeloAEliminar) ;
            System.out.println("Eliminado. ");
        } else {
            System.out.println("Ese Modelo no esta en la Lista. ");
        }

        if (listaDeseos.isEmpty()) {
            System.out.println("Tu lista de Deseos esta Vacía. ");
        } else {
            System.out.println("Te Quedan " + listaDeseos.size() + " Modelos en tu Lista de Deseos. " + listaDeseos);
        }

        sc.close();
    }
}


