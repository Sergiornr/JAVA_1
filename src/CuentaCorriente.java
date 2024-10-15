public class CuentaCorriente extends Cuenta{
    private Double montoDescubiertoAutorizado;

    public CuentaCorriente(Double saldo, Integer cliente, Double montoDescubiertoAutorizado) {
        super(saldo, cliente);
        this.montoDescubiertoAutorizado = montoDescubiertoAutorizado;
    }

    public void depositarCheque(Double cheque){

    }
}
