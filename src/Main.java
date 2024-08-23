import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        otorgaPrestamo(200.0,800.0);
        esMayor(3.2, 6.4 , 0.5);


        String nombre = "Sergio";

        equalString(nombre.toLowerCase(), "sergio");


        Boolean esDivisible = esDivisible(30, 30);
        System.out.println(esDivisible);




     char inicial = devuelveInicial("sergio");
        System.out.println(inicial);
        //Definir dos cadenas de texto. Comprobar si son iguales o distintas e indicar mediante un mensaje.
        //Definir dos Integer y determinar cuál es mayor, cuál es menor o si son iguales. Imprimir el resultado obtenido.
        //Crea una fecha de nacimiento y calcula la edad. Además imprimí por consola la edad, junto con la fecha formateada de esta forma “YY MM DD”.
        //Convertir las variables anteriores en String e imprimirlas por consola indicando su clase.


        String text1= " Hola ";
        String text2= "Hello";
        int resultado2;
        if (text1.equals(text2)) {
            System.out.println("Son iguales");
        }
        else {
            System.out.println("Son distintos");
        }

Integer num1 = 3;
Integer num2 = 5 ;
if (num1.compareTo(num2)==1) {
    System.out.println(" Es mayor");
}
    else if (num1.compareTo(num2)==0){
    System.out.println(" Son iguales");

}
    else{
    System.out.println(" Es menor");
}


        LocalDate fechaNacimiento = LocalDate.of(1987,5,2);
    LocalDate fechaActual = LocalDate.now();
 Integer resta = fechaActual.getYear() - fechaNacimiento.getYear();
        DateTimeFormatter formatear= DateTimeFormatter.ofPattern("dd MM yyyy");
        String fechaFormateada= formatear.format(fechaNacimiento) ;
        System.out.println(resta +" "+ fechaFormateada );




        String stringA= Integer.toString(num1);
        String stringB= Integer.toString(num2);
        System.out.println(stringA.getClass() + " " + stringB.getClass());
//Crea una función que reciba un nombre y retorne la inicial del mismo.
// Debe contar la cantidad de veces que se repite dicho carácter.





    }
    public static char devuelveInicial (String nombre ){
        return nombre.charAt(0);
    }

    //Crea una función que reciba como parámetro dos valores y devuelva un boolean.
    // La misma debe comprobar si el primer número es divisible por el segundo.

    public static boolean esDivisible (Integer numA, Integer numB){
        return numA%numB == 0;
    }



    /*Crea una función que reciba dos cadenas de texto.
    Debe comparar si son iguales y retorna
    un booleano además de imprimir un mensaje con el resultado.
     */
 public static boolean equalString (String textA, String textB){
     Boolean resultado = textA.equals(textB);
     System.out.println(resultado);
     return resultado ;
 }
/*Definir dos variables Integer y asignarles un valor a cada una,
crea una función que determine si el primero es mayor que el producto del segundo y un porcentaje dado.*/

    public static boolean esMayor (Double numA , Double numB, Double porcentaje){
        Double productoBP = numB * porcentaje;

        if (numA.compareTo(productoBP)== 1){
            System.out.println("El primero es mayor");
            return true;
        } else if (numA.compareTo(productoBP)== 0) {
            System.out.println("El primero es igual");
            return false;
        } else  {
            System.out.println("El primero es menor");
            return false;
        }
    }




/*Debemos desarrollar una funcionalidad para una entidad de préstamos que indique
si la persona está habilitada a obtener uno en base a que el monto solicitado no supere el 35% de su sueldo.
 */
public static void otorgaPrestamo (Double monto, Double sueldo){
    if (sueldo*0.35 > monto){
        System.out.println("Prestamo otorgado");

    }else {
        System.out.println("Prestamo denegado");
    }
}



}