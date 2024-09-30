import java.util.Random;

public class MathEjercicios {
    public static void main(String[] args){
        //Math pow se emplea para calcular potencias de números.
        double base = 10;
        double exponente = 4;
        double resultadoPotencia;
        resultadoPotencia = Math.pow(base, exponente);
        System.out.println( base + " elevado a " + exponente + " es " + resultadoPotencia);

        //Math.sqrt se emplea para hayar la raíz cuadrada de un número.
        double numero = 9;
        double resultadoSqrt = Math.sqrt(numero);
        System.out.println("La raíz cuadrada de " + numero + " es " + resultadoSqrt);

        //Math.abs devuelve el valor absoluto de una cifra.
        double valor = -7;
        double resultadoAbs = Math.abs(valor);
        System.out.println("El valor absoluto de " + valor + " es " + resultadoAbs);

        Random aleatorio = new Random();
        int numeroPremio = aleatorio.nextInt(101);
        System.out.println("El número premiado es el " + numeroPremio);
    }
}
