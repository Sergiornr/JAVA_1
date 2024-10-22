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
    public Double extraer(Double monto) {
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
    public void depositar(Double deposito) {
        if (deposito <= 0){
            System.out.println("Ingrese un monto valido ");
        } else if (!(montoDescubiertoAutorizado.equals(limiteMontoAutorizado))){
           Double deuda = limiteMontoAutorizado - montoDescubiertoAutorizado;
           montoDescubiertoAutorizado = montoDescubiertoAutorizado + deuda;
           deposito=  deposito - deuda;
           setSaldo(getSaldo()+ deposito);
            System.out.println("El saldo quedo en "+getSaldo()+"el monto disponible es "+montoDescubiertoAutorizado);
        } if (monto >= diferencia) {

            this.montoDisponible = this.montoDisponible + diferencia;
            monto -= diferencia;
            this.setSaldo(monto);
            System.out.println("saldo actual después de depositar" + this.getSaldo());

        } else {
            this.montoDisponible = this.montoDisponible + monto;
            System.out.println("saldo actual después de depositar" + this.getSaldo() +
                    " descubierto quedó en" + this.montoDisponible);
        }
    } else {
        Double nuevoSaldo = this.getSaldo() + monto;
        this.setSaldo(nuevoSaldo);
        System.out.println("saldo actual después de depositar " + this.getSaldo());
        }

    }



