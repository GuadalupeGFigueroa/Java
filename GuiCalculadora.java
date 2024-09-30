import javax.swing.JOptionPane;
import java.util.Scanner;
import java.lang.Math; 

public class GuiCalculadora {
    
   
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("¿Cómo te llamas?");
        JOptionPane.showMessageDialog(null,"¡Hola, " + name + " !"); 


        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce un número"));    
        System.out.println("Selecciona una operación:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el segundo número"));
        
        int opcion = scanner.nextInt();
        double resultado = 0;
        
        switch (opcion) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1*num2;
                break;
            case 4:
                if (num2!=0) {
                    resultado = num1/num2;
                }else{
                    JOptionPane.showMessageDialog(null,"No se puede dividir entre cero.");
                }
                
                break;
            default:
                System.out.println("Opción inválida.");
                return;
        }
        
        System.out.println("El resultado es: " + resultado);

                
        
        
        
        
        if (selection == 0) {
            resultado = numero1 + numero2;
            JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
            */
        }
        

    }
}
       
       

