public class CajaAhorro extends Cuenta {
    private Double tasaInteres;


    public CajaAhorro(Double saldo, Integer cliente, Double tasaInteres) {
        super(saldo, cliente);
        this.tasaInteres = tasaInteres;}
        @Override
        public void depositarEfectivo(Double deposito){

        }
        @Override
        public Double extraerEfectivo(Double monto){
            return 0.0;
        }

}
