public class EmpleadoLimpiezaGeneral extends EmpleadoLimpieza{

    private Integer cantidadHorasExtras = 0;
    private static Double valorHoraExtra = 3000.0;

    public EmpleadoLimpiezaGeneral(String nombreR, Integer dniR, Integer legajoR, Integer cantidadHorasExtras) {
        super(nombreR, dniR, legajoR);
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
