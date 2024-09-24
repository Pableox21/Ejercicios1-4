package ejercicio4_1.Libro;

public class LibroUniversidad extends LibroTexto {
    protected String facultad;

    public LibroUniversidad(String titulo, String autor, double precio, String curso, String facultad) {
        super(titulo, autor, precio, curso);
        this.facultad = facultad;
    }

    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Facultad= "+facultad);
        System.out.println();
    }
}
