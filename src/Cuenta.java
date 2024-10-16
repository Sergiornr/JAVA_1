public abstract class  Cuenta {

    private Double saldo;
    private Cliente cliente;

    public Cuenta(Double saldo, Cliente cliente) {
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public abstract void depositarEfectivo(Double deposito);


    public abstract Double extraerEfectivo(Double monto);
    public void informarSaldo(){
        System.out.println("tiene saldo disponible "+ saldo);
    }
}
