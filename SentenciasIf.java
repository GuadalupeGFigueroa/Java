import javax.swing.JOptionPane;



public class SentenciasIf {
    public static void main(String[] args) {
        String num1String = JOptionPane.showInputDialog("Introduce un número.");
        int numero = Integer.parseInt(num1String);

        if(numero%2 == 0){
            JOptionPane.showMessageDialog(null, "El númerro es par.");
        }else{
            JOptionPane.showMessageDialog(null,"El número es impar.");
        }
    
   
    }
}