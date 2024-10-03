public class EmpleadoLimpieza extends Empleado{

  protected static Double sueldoFijo;
  protected Double sueldoTotal;

  public EmpleadoLimpieza(String nombreR, Integer dniR, Integer legajoR, Double sueldoTotal) {
    super(nombreR, dniR, legajoR);
    this.sueldoTotal = sueldoTotal;
  }

  public void calcularSueldoMes(){

  }

  public static void setSueldoFijo(Double sueldoFijo) {
    EmpleadoLimpieza.sueldoFijo = sueldoFijo;
  }
}
