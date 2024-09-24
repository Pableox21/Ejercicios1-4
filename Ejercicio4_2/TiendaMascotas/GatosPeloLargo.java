package Ejercicio4_2.TiendaMascotas;

public class GatosPeloLargo extends Gato{
    enum raza{angora,himalayo,balinés,somalí};
    protected raza razaGatosPeloLargo;

    public GatosPeloLargo(String nombre, int edad, String color, double alturaSalto, double longitudSalto,raza razaGatosPeloLargo) {
        super(nombre, edad, color, alturaSalto, longitudSalto);
        this.razaGatosPeloLargo = razaGatosPeloLargo;
    }
    void imprimir() {
        super.imprimir();
        System.out.println("La raza del gato es= "+razaGatosPeloLargo);
        System.out.println();
    }
    void sonido() {
        super.sonido();
    }
}
