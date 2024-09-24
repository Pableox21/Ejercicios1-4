package ejercicio4_1;

public class Ahorros extends Cuenta{
    private boolean activa;
    public Ahorros(float Saldo,float Tasa){
        super(Saldo,Tasa);
        if (Saldo<10000)
            activa = false;
        else
            activa=true;
    }
    public void Retirar(float Cantidad){
        if (activa)
            super.Retirar(Cantidad);
    }
    public void Consignar(float Cantidad){
        if (activa)
        super.Consignar(Cantidad);
    }
    public void ExtractoMensual(){
        if (NumeroRetiros>4){
            ComisionMensual+=(NumeroRetiros-4)*1000;
        }
        super.ExtractoMensual();
        if (Saldo<10000)
            activa=false;
    }
    public void Imprimir(){
        System.out.println("Saldo= $ "+Saldo);
        System.out.println("Comision mensual= $ "+ComisionMensual);
        System.out.println("Numero de transacciones= "+(NumeroConsignaciones+NumeroRetiros));
        System.out.println();
    }
}
