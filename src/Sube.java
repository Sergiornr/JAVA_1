public class Sube {

    private int codigo;
    private Double saldoDisponible;
    private Double limiteSaldoNegativo;

    public Sube(int codigo, double saldoDisponible) {
        this.codigo = codigo;
        this.saldoDisponible = saldoDisponible;
    }

    public static void setLimiteSaldoNegativo(double nuevoLimite) {
        limiteSaldoNegativo = nuevoLimite;

    }

    // acceder desde el objeto
    public double getLimiteSaldoNegativo() {
        return limiteSaldoNegativo;
    }

    // acceder desde la clase
    public static double getLimiteSaldoNegativo2() {
        return limiteSaldoNegativo;
    }


    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

}
}

