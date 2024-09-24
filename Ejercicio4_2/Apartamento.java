package Ejercicio4_2;

public class Apartamento extends inmuebleVivienda{
    public Apartamento(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños);
    }

    void imprimir() {
        super.imprimir();
    }
}
