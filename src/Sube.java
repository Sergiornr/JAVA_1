public class Sube {

    private final Integer CODIGO ;
    private Double saldoDisponible;
    private static Double limiteSaldoNegativo = 430.0;

    public Sube(Integer CODIGO, double saldoDisponible) {
        this.CODIGO = CODIGO;
        this.saldoDisponible = saldoDisponible;
    }

    public double getLimiteSaldoNegativo() {
        return limiteSaldoNegativo;
    }

    public static void setLimiteSaldoNegativo(double nuevoLimite) {
        limiteSaldoNegativo = nuevoLimite;

    }
    public Double getSaldoDisponible(){
        return saldoDisponible;
    }
    public void setSaldoDisponible(double saldoNuevo) {
        this.saldoDisponible = saldoNuevo;
    }

    @Override
    public String toString() {
        return "Sube{" +
                "CODIGO=" + CODIGO +
                ", saldoDisponible=" + saldoDisponible +
                ", limiteSaldoNegativo=" + limiteSaldoNegativo +
                '}';
    }
}


