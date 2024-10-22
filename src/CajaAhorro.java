public class CajaAhorro extends Cuenta {
    private Double tasaInteres;


    public CajaAhorro(Double saldo, Cliente cliente, Double tasaInteres) {
        super(saldo, cliente);
        this.tasaInteres = tasaInteres;}
        @Override
        public void depositar(Double deposito){
Double nuevoSaldo = getSaldo() + deposito;
this.setSaldo(nuevoSaldo);
        }
        @Override
        public Double extraer(Double monto){
            if (getSaldo()>= monto){
              setSaldo(getSaldo() - monto);
                System.out.println(monto);
              return monto;
            }else {
                System.out.println("Indique un monto valido");
                return null;
            }
        }



}

