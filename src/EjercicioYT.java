import java.util.Scanner;

public class EjercicioYT {
    public static void main (String[] args) {
         Scanner sc = new Scanner(System.in);

         String name = "Andres";
         System.out.println("Tu Nombre es: " + name);

         int age = 27;
         System.out.println("Tu edad es: " + age);

         double altura = 1.77;
         System.out.println("Tu altura es: " + altura);

         boolean teGustaEntrenar = true;
         System.out.println("Te Gusta Programar? " + teGustaEntrenar);

          final String EMAIL = "andre1998cifuentes@gmail.com";
         System.out.println("Tu correo es: " + EMAIL);

         char inicial = 'A';
         System.out.println("Tu Inicial es: " + inicial);

         String localidad = "La-72";
         System.out.println("Tu Localidad es: " + localidad);

         System.out.println("Escribe dos números: ");
         int num1 = sc.nextInt();
         int num2 = sc.nextInt();
         System.out.println("Suma = " + (num1 + num2));


         //Obtener Cadena
         System.out.println(name.charAt(2));

         //Saber tamaño
         System.out.println(name.length());

         //Subcadena
         System.out.println(name.substring(0, 4));

         //Mayúscula y Minúscula
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        //Comprobar si Contiene
        System.out.println("Hola, Java".contains("Andres"));
        System.out.println("Hola, Java".toUpperCase().contains("JAV"));

        //Comparación
        System.out.println(name.equals("Andres"));
        System.out.println(name.equals("andres"));
        System.out.println(name.equalsIgnoreCase("andres"));

        //Trim (Elimina espacios al inicio y al final)
        System.out.println(" Hola, me llamo Andres ".trim());

        // Replace
        System.out.println(" Hola, me llamo Andres ".replace("Andres", "Steven "));

        // Format
        var edad = 27;
        System.out.println(String.format("Hola, %s. Tengo %d. ", name, edad));









    }
};
