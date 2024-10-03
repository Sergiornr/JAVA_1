public class EmpleadoLimpiezaGeneral extends EmpleadoLimpieza{

    private Integer cantidadHorasExtras;
    private static Double valorHoraExtra;

    public EmpleadoLimpiezaGeneral(String nombreR, Integer dniR, Integer legajoR, Double sueldoTotal, Integer cantidadHorasExtras) {
        super(nombreR, dniR, legajoR, sueldoTotal);
        this.cantidadHorasExtras = cantidadHorasExtras;
    }

    public static void setValorHoraExtra(Double valorHoraExtra) {
        EmpleadoLimpiezaGeneral.valorHoraExtra = valorHoraExtra;
    }

    public Double calcularValorHorasExtra(){
return this.cantidadHorasExtras*valorHoraExtra;
    }
    public void realizarHorasExtra(Integer cantidadHorasExtras){
this.cantidadHorasExtras += cantidadHorasExtras;
    }
@Override
public void calcularSueldoMes(){
sueldoTotal = sueldoFijo + calcularValorHorasExtra();
    System.out.println(sueldoTotal);
}
}
