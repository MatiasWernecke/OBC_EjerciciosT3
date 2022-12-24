public class EjercicioT3_P1{


    /*
     * Crear una función con tres parámetros que sean números que se suman entre sí.
     * 
     * Llamar a la función en el main y darle valores.
     */

        public static double sumarTresValores (double valor1, double valor2, double valor3){
        
        return valor1 + valor2 + valor3;

     }

     public static void main(String[] args) {
        
        System.out.println(sumarTresValores(1, 1.5, 0));
     }
}