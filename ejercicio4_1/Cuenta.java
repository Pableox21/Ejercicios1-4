package ejercicio4_1;

public class Cuenta {
    protected float Saldo;
    protected int NumeroConsignaciones=0;
    protected int NumeroRetiros=0;
    protected float TasaAnual;
    protected float ComisionMensual=0;

    public Cuenta(float Saldo,float TasaAnual) {
        this.Saldo = Saldo;
        this.TasaAnual=TasaAnual;
    }
    public  void Consignar(float Cantidad){
        Saldo=Saldo+Cantidad;
        NumeroConsignaciones=NumeroConsignaciones+1;
    }
    public void Retirar(float Cantidad){
        float NuevoSaldo=Saldo-Cantidad;
        if (NuevoSaldo>=0){
            Saldo-=Cantidad;
            NumeroRetiros=NumeroRetiros+1;
        }else {
            System.out.println("La cantidad a retirar exede el saldo actual");
        }
    }
    public void CalcularInteres(){
        float TasaMensual=TasaAnual/12;
        float InteresMensual=Saldo*TasaMensual;
        Saldo+=InteresMensual;
    }
    public void ExtractoMensual(){
        Saldo-=ComisionMensual;
        CalcularInteres();
    }
}
