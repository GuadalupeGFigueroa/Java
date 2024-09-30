import javax.swing.JOptionPane;


public class SentenciasIf2 {
    public class GregorianCalendar {
            String yearString = JOptionPane.showInputDialog("Introduce un año");
        int year = Integer.parseInt(yearString);

        If(year.isLeapYear) {
            JOptionPane.showMessageDialog(null, "El año es bisiesto.");
        }else{
            JOptionPane.showMessageDialog(null,"El año no es bisiesto.");
        }
        

        } 
}
