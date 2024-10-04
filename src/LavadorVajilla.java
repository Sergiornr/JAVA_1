public class LavadorVajilla extends EmpleadoLimpieza {

    private Integer cantidadVajillaRota = 0 ;
    private Double costoAcumuladoVajillaRota = 0.0;

    public LavadorVajilla(String nombreR, Integer dniR, Integer legajoR,Integer cantidadVajillaRota) {
        super(nombreR, dniR, legajoR);
        this.cantidadVajillaRota = cantidadVajillaRota;
        this.costoAcumuladoVajillaRota = costoAcumuladoVajillaRota;
    }
        @Override
        public void calcularSueldoMes() {
            if (this.cantidadVajillaRota > 1) {
                this.descontarSueldo();
            }
            System.out.println("su sueldo de este mes es de: " + sueldoTotal);
    }
        public void romperVajilla(Integer cantidadVajillaRota, Double costoVajillaRota){
            this.cantidadVajillaRota += cantidadVajillaRota;
               this.costoAcumuladoVajillaRota +=  cantidadVajillaRota * costoVajillaRota;

        }
        private void descontarSueldo(){
            this.sueldoTotal -= this.costoAcumuladoVajillaRota;
        }

}