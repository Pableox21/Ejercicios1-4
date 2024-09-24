package ejercicio4_1;

public class Corriente extends Cuenta{
    float Sobregiro;

    public Corriente(float saldo, float Tasa) {
        super(saldo, Tasa);
        Sobregiro=0;
    }
    public void Retirar(float Cantidad){
        float Resultado=Saldo-Cantidad;
        if (Resultado<0){
            Sobregiro=Sobregiro-Resultado;
            Saldo=0;
        }else {
            super.Retirar(Cantidad);
        }
    }
    public void Consignar(float Cantidad){
        float Residuo=Sobregiro-Cantidad;
        if (Sobregiro>0){
            if (Residuo>0){
                Sobregiro=0;
                Saldo=Residuo;
            }else {
                Sobregiro=-Residuo;
                Saldo=0;
            }
        }else {
            super.Consignar(Cantidad);
        }
    }
    public void ExtractoMensual(){
        super.ExtractoMensual();
    }
    public void Imprimir(){
        System.out.println("Saldo = $ " + Saldo);
        System.out.println("Cargo mensual = $ " + ComisionMensual);
        System.out.println("Número de transacciones = " + (NumeroConsignaciones+NumeroRetiros));
        System.out.println("Valor de sogregiro = $" + (NumeroConsignaciones+NumeroRetiros));
        System.out.println();
    }
}
