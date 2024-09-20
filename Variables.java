public class Variables {

    public static void main(String[] args) {

        int stock = 50;
        int sold = 10; 
        String name = "Tablones de Roble";

        System.out.println(stock); 
        System.out.println(name);
        System.out.println(sold);
        System.out.println("Quedan en el almacen: " + stock + " unidades. " +  "Se han vendido "+ sold + " unidades."); 
       
        //Intercambiar usando operaciones aritméticas:
        sold = sold + stock;
        stock = sold - stock;
        sold = sold - stock;

        System.out.println("Ahora el valor de la variable stock es de: " + stock); 
        System.out.println("Ahora el valor de la variable sold es " + sold);

        //Intercambiar usando XOR bit a bit: Intercambia dos variables enteras
        sold = sold ^ stock;
        stock = sold ^ stock;
        sold = sold ^stock;
        System.out.println("después del cambio el es stock es de: "+ stock); 
        System.out.println("después del cambio se han vendido " + sold);

    }
}
