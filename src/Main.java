import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ingresarMascota();
    Mascota perro1 = new Mascota("copito",3,"canina");
    Mascota gato1 = new Mascota("guanina",2,"gatuna");
    Dueño sergio1 = new Dueño("sergio", 255256," CALLE 12");
    Veterinario veterinario1 = new Veterinario("Alberto Costas", 345678, "clinico");
    sergio1.registrarMascota(perro1);
    sergio1.listarAnimales();
    sergio1.programarTurno(veterinario1);
    veterinario1.realizarExamen(perro1);
    perro1.setInfo("copito", 3);
    System.out.println(perro1.toString());

        }



    //Incluí en la clase Main de tu sistema una función que permita al
    // usuario ingresar mascotas de forma individual hasta que el mismo decida,
    // al finalizar deben listarse los elementos ingresados.
    public static void ingresarMascota(){
        // ¿continuar?
        Boolean continuar=true;
        // esta es la lista de motores
        ArrayList<Mascota> mascotas= new ArrayList<>();
        Scanner scanner= new Scanner(System.in);
        while(continuar){


            System.out.println("ingresa nombre de la mascota");
            String nombre = scanner.nextLine();
            System.out.println("ingresa edad");
            Integer edad = scanner.nextInt();
            scanner.nextLine();
            System.out.println("ingresa especie de la mascota");
            String especie = scanner.nextLine();
            Mascota nuevaMascota= new Mascota(nombre,edad,especie);
            mascotas.add(nuevaMascota);


            System.out.println("¿Continuar ingresando info? ");
            continuar= scanner.nextBoolean();
            scanner.nextLine();


        }
        for (int i = 0; i < mascotas.size(); i++) {
            System.out.println(mascotas.get(i));
        }


    }
    //Crea otra función que busque un elemento en la colección, confirme si está y
    // consulte al usuario si quiere eliminarlo.
   public static void buscarElemento(){




   }





}




