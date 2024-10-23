public class CuentaComitente extends Cuenta{

    private String claveAutorizacion;


    public CuentaComitente(Double saldo, Cliente cliente, String claveAutorizacion ) {
        super(saldo, cliente);
        this.claveAutorizacion = claveAutorizacion;
    }
// extraer sin clave, limitado al saldo minimo
    @Override
    public Double extraer(Double monto) {
        if (monto <= (getSaldo()*0.5)){
            setSaldo(getSaldo()- monto);
            return monto;
        } else {
            System.out.println("saldo insuficiente");
            return 0.0;
        }
    }
    // extraer con clave, sin restriccion del minimo
    public Double extraer( Double monto, String clave){
        if (clave.equals(this.claveAutorizacion)){
            setSaldo(getSaldo()- monto);
            return monto;
        } else{
            System.out.println("clave incorrecta");
            return null;
        }
    }

    @Override
    public void depositar(Double deposito) {
        if (deposito  > 0){
            Double depositoSinComision = deposito - deposito*0.01;
            setSaldo(getSaldo()+ depositoSinComision);
            System.out.println("el saldo actual es : " + getSaldo()+ " el deposito sin comision es "+ depositoSinComision);
        } else {
            System.out.println("El importe debe ser mayor a cero");
        }
    }
}
