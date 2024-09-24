package ejercicio4_1.Libro;

public class Test {
    public static void main(String[] args) {
        Libro libro1=new Libro("Necronomicón", "H.P. Lovecraft",70);
        LibroUniversidad libroUniversidad1=new LibroUniversidad("Termodnamica","Sheldon Cooper",50,"Tercero","Fisica");
        LibroNovela libroNovela1=new LibroNovela("Dune","Frank Herbert",75, LibroNovela.tipo.cienciaFicción);
        LibroTexto libroTexto1=new LibroTexto("Literatura","Coquito",55,"Cuarto");
        libro1.mostrarInformacion();
        libroUniversidad1.mostrarInformacion();
        libroNovela1.mostrarInformacion();

    }
}
