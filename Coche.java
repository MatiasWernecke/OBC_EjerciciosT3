public class Coche{


    private int numPuertas;


    public Coche(){
        numPuertas = 2;
    }

    public void añadirPuerta(){
        numPuertas ++;
    }

    public int obtenerNumPuertas(){
        return numPuertas;
    }

   
    public static void main(String[] args) {
        
        Coche miCoche = new Coche();
        
        miCoche.añadirPuerta();
        System.out.println(miCoche.obtenerNumPuertas());
    }


}