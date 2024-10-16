import java.util.Date;

public class Cheque {
    private Double monto;
    private String bancoEmisor;
    private Date fechaPago;

    public Cheque(Double monto, String bancoEmisor, Date fechaPago) {
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






