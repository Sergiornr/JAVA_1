public abstract class Mamifero extends Animal {
    protected Integer cantidadCrias;

    public Mamifero(String nombre, Integer edad, Integer cantidadCrias) {
        super(nombre, edad);
        this.cantidadCrias = cantidadCrias;
    }
    @Override
    public void comer(){
        System.out.println("esta comiendo");
    };
    public void amamantar(){
        System.out.println("Amamanta crias");

    }

}
