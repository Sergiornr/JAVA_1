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
            System.out.println("Este es el saldo nuevo " + getSaldo());
            return monto;
        } else if (getSaldo() + montoDescubiertoAutorizado >= monto) {
            Double descubiertoSolicitado = monto - getSaldo();
            setSaldo(0.0);
            montoDescubiertoAutorizado = montoDescubiertoAutorizado - descubiertoSolicitado;
            System.out.println("Este es el monto descubierto disponible " + montoDescubiertoAutorizado);
            return monto;
        }
        System.out.println("indique un monto valido ");
        return null;
    }

    @Override
    public void depositar(Double deposito) {

        if (deposito <= 0.0) {
            System.out.println("Ingrese un monto valido ");
        } else {
            Double deuda = limiteMontoAutorizado - montoDescubiertoAutorizado;

            if (deposito >= deuda) {
                montoDescubiertoAutorizado += deuda;
                Double depositoRestante = deposito - deuda;
                setSaldo(getSaldo() + depositoRestante);
                System.out.println("Saldo actual " + getSaldo());
            } else {
                montoDescubiertoAutorizado += deuda;
                System.out.println("el monto queda en " + montoDescubiertoAutorizado);
            }


        }

    }

    public void depositarCheque(Cheque cheque) {
        if (cheque.getMonto() <= 0.0) {
            System.out.println("Ingresa un monto valido");
        } else {
            Double diferencia = limiteMontoAutorizado - montoDescubiertoAutorizado;
            if (cheque.getMonto() >= diferencia) {
                montoDescubiertoAutorizado += diferencia;
                Double depositoRestante = cheque.getMonto() - diferencia;
                setSaldo(getSaldo() + depositoRestante);
                System.out.println("Saldo actual " + getSaldo());
            } else {
                montoDescubiertoAutorizado += diferencia;
                System.out.println("el monto queda en " + montoDescubiertoAutorizado);
            }
        }
    }
}

