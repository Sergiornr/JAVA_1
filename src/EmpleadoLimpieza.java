public class EmpleadoLimpieza extends Empleado{

  protected static Double sueldoFijo = 600000.0;
  protected Double sueldoTotal;

  public EmpleadoLimpieza(String nombreR, Integer dniR, Integer legajoR) {
    super(nombreR, dniR, legajoR);
    this.sueldoTotal = sueldoFijo;
  }


  public void calcularSueldoMes(){

  }

  public static void setSueldoFijo(Double sueldoFijo) {
    EmpleadoLimpieza.sueldoFijo = sueldoFijo;
  }
}
