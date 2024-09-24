package ejercicio4_1.Libro;

import ejercicio4_1.Libro.Libro;

public class LibroTexto extends Libro {
    protected String curso;

    public LibroTexto(String titulo, String autor, double precio, String curso) {
        super(titulo, autor, precio);
        this.curso = curso;
    }

    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Curso= "+curso);
    }
}
