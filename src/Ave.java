public class Ave extends Animal implements Oviparo {
    protected String plumaje;

    public Ave(String nombre, Integer edad, String plumaje) {
        super(nombre, edad);
        this.plumaje = plumaje;
    }

    @Override
    public void comer() {
        System.out.println("esta comiendo");
    }

    public void romperCascaron(){
        System.out.println("Rompiendo el carcaron");
    }
    @Override
    public void ponerHuevos(){
        System.out.println("el ave se llama "+ this.nombre+" pone huevos");
    }
}
