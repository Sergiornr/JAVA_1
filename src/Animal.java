public abstract class Animal {
    protected String nombre;
    protected Integer edad;

    public Animal (String nombre,Integer edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public abstract void comer();



}
