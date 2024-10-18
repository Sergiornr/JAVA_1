public class Ornitorrinco extends Mamifero implements Oviparo{
    public Ornitorrinco(String nombre, Integer edad, Integer cantidadCrias) {
        super(nombre, edad, cantidadCrias);
    }
    @Override
    public void ponerHuevos(){
        System.out.println("el ave se llama "+ this.nombre+" pone huevos");
    }
}
