package Ejercicio4_2;

public class inmueble {
    protected int identificadorInmobiliario;
    protected int area;
    protected String direccion;
    protected double precioVenta;

    public inmueble(int identificadorInmobiliario, int area, String direccion) {
        this.identificadorInmobiliario = identificadorInmobiliario;
        this.area = area;
        this.direccion = direccion;
    }
    double calcularPrecioVenta(double valorArea){
        precioVenta=area*valorArea;
        return precioVenta;
    }
    void imprimir(){
        System.out.println("Identificador inmobiliario= "+identificadorInmobiliario);
        System.out.println("Area= "+area);
        System.out.println("Direccion= "+direccion);
        System.out.println("Precio de venta= "+precioVenta);
    }
}
