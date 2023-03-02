public class Main {

    public static void main(String[] args) {
        Coche miCoche = new Coche(3);
        miCoche.agregarPuerta();

        System.out.println(miCoche.getNumPuertas());
    }
}