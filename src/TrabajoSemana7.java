import java.util.Scanner;

public class TrabajoSemana7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe Tu Contraseña: ");
        String contraseña = sc.nextLine();

        boolean tieneLetra = false;
        boolean tieneNumero = false;
        boolean tieneSimDiferente = false;

        if (contraseña.length() < 10) {
            System.out.print("Contraseña Insegura (Muy Corta) ");
            return;
        }
        for (int i = 0; i < contraseña.length(); i ++) {
            char contra = contraseña.charAt(i);

            if (Character.isLetter(contra)) {
                tieneLetra = true;
            } else if (Character.isDigit(contra)) {
                tieneNumero = true;
            } else {
                tieneSimDiferente = true;
            }
        }
         if (tieneLetra && tieneNumero && tieneSimDiferente) {
             System.out.println("Contraseña Segura ");
         } else {
             System.out.println("Contraseña Insegura ");
         }
        sc.close();
    }
}
