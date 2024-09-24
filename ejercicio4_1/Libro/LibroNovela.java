package ejercicio4_1.Libro;

import ejercicio4_1.Libro.Libro;

public class LibroNovela extends Libro {
    enum tipo{histórica,romántica,policíaca,realista,cienciaFicción,aventuras};
protected tipo tipoNovela;

    public LibroNovela(String titulo, String autor, double precio, tipo tipoNovela) {
        super(titulo, autor, precio);
        this.tipoNovela = tipoNovela;
    }

    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo de novela= "+tipoNovela);
    }
}
