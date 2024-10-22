public class CuentaComitente extends Cuenta{

    private String claveAutorizacion;
    private static final double LIMITE_MINIMO = 1000.0;

    public CuentaComitente(Double saldo, Cliente cliente, String claveAutorizacion) {
        super(saldo, cliente);
        this.claveAutorizacion = claveAutorizacion;
    }
// extraer sin clave, limitado al saldo minimo
    @Override
    public boolean extraer(Double monto) {
        if (importe <= (getSaldo()- LIMITE_MINIMO)){
            return super.extraer(monto);
        } else {
            return false;
        }
    }
    // extraer con clave, sin restriccion del minimo
    public boolean extraer( Double monto, String clave){
        if (clave.equals(this.claveAutorizacion)){
            return super.extraer(monto)
        } else{
            return false; // clave incorrecta
        }
    }

    @Override
    public void depositar(Double deposito) {
        if (deposito > 0){
            super.depositar(deposito);
        } else {
            System.out.println("El importe debe ser mayor a cero");
        }
    }
}
