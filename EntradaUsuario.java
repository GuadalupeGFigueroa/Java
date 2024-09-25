import java.util.Scanner;


public class EntradaUsuario {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("¿Cómo te llamas?");
    String name = scanner.nextLine();

    System.out.println("¿Cuántos años tienes? ");
    int age = scanner.nextInt();
    scanner.nextLine();

    System.out.println("¿cuánto mides (en metros?");
    double height = scanner.nextDouble();
    scanner.nextLine();


    System.out.println("Hola "+ name);
    System.out.println("Tienes "+ age +" años");
    System.out.println("Mides "+ height + " metros");

    System.out.println("Elige un número ");
    int numero1 = scanner.nextInt();
    scanner.nextLine();
 
    System.out.println("Elige otro número ");
    int numero2 = scanner.nextInt();
    scanner.nextLine();

    int numerofinal = numero1 + numero2;
    System.out.print("El resultado de su suma es: " + numerofinal);
   
    scanner.close();
    
    } 
}

