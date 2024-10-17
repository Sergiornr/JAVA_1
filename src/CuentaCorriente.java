public class CuentaCorriente extends Cuenta {
    private static Double limiteMontoAutorizado = 50000.0;
    private Double montoDescubiertoAutorizado;

    public CuentaCorriente(Double saldo, Cliente cliente) {
        super(saldo, cliente);
        this.montoDescubiertoAutorizado = limiteMontoAutorizado;
    }

    public void depositarCheque(Double cheque) {

    }

    @Override
    public Double extraerEfectivo(Double monto) {
        if (getSaldo() >= monto) {
            Double saldoNuevo = getSaldo() - monto;
            setSaldo(saldoNuevo);
            System.out.println("Este es el saldo nuevo "+ getSaldo());
            return monto;
        } else if (getSaldo()+ montoDescubiertoAutorizado>= monto) {
            Double descubiertoSolicitado= monto - getSaldo();
            setSaldo(0.0);
            montoDescubiertoAutorizado = montoDescubiertoAutorizado - descubiertoSolicitado;
            System.out.println("Este es el monto descubierto disponible "+ montoDescubiertoAutorizado);
            return monto;
        }
        System.out.println("indique un monto valido ");
        return null;
    }

    @Override
    public void depositarEfectivo(Double deposito) {
        if (deposito <= 0){
            System.out.println("Ingrese un monto valido ");
        } else if (!(montoDescubiertoAutorizado.equals(limiteMontoAutorizado))){
           Double deuda = limiteMontoAutorizado - montoDescubiertoAutorizado;
           montoDescubiertoAutorizado = montoDescubiertoAutorizado + deuda;
           deposito=  deposito - deuda;
           setSaldo(getSaldo()+ deposito);
            System.out.println("El saldo quedo en "+getSaldo()+"el monto disponible es "+montoDescubiertoAutorizado);
        } else  {
            setSaldo(getSaldo()+ deposito);
            System.out.println(" Saldo actual "+ getSaldo());
        }

    }


}
