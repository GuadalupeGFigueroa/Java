import java.util.Scanner;
import java.lang.Math;

//Falta ejercicio 7 expresiones aritméticas.




public class Expresiones {
    public static void main(String[] args) {
        //Área de un círculo = π r² 
        
        double radio;
        double area;
        Scanner scanner = new Scanner(System.in);
            
        System.out.println("Introduce el radio del círculo: ");
        radio = scanner.nextDouble();    
        
        area = Math.PI * Math.pow(radio, 2);
        
        System.out.println("El área de un círculo con radio igual a " + radio + " es: "+ area );
    
    scanner.close();
    }
}        

