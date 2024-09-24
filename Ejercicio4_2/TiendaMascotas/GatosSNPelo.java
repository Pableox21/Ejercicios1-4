package Ejercicio4_2.TiendaMascotas;

public class GatosSNPelo extends Gato{
    enum raza{esfinge,elfo,donskoy};
    protected raza razaGatosSNPelo;

    public GatosSNPelo(String nombre, int edad, String color, double alturaSalto, double longitudSalto, raza razaGatosSNPelo) {
        super(nombre, edad, color, alturaSalto, longitudSalto);
        this.razaGatosSNPelo = razaGatosSNPelo;
    }

    void imprimir() {
        super.imprimir();
        System.out.println("La raza del gato es= "+razaGatosSNPelo);
        System.out.println();
    }

    void sonido() {
        super.sonido();
    }
}
