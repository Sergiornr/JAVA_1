import java.util.Date;

public class Cheque extends CuentaCorriente{
    private Double monto;
    private String bancoEmisor;
    private Date fechaPago;

    public Cheque(Double saldo, Integer cliente, Double montoDescubiertoAutorizado, Double monto, String bancoEmisor, Date fechaPago) {
        super(saldo, cliente, montoDescubiertoAutorizado);
        this.monto = monto;
        this.bancoEmisor = bancoEmisor;
        this.fechaPago = fechaPago;
    }

    @Override
    public String toString() {
        return "Cheque{" +
                "monto=" + monto +
                ", bancoEmisor='" + bancoEmisor + '\'' +
                ", fechaPago=" + fechaPago +
                '}';
    }
}
