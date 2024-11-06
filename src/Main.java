import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente(45098765, "Leonardo", 118765432, "23/10/2024");
        Paciente paciente2 = new Paciente(45098756, "Marcelo", 118765443, "23/10/2024");
        Paciente paciente3 = new Paciente(45098743, "Maximiliano", 118765498, "23/10/2024");
        Profesional profesional1 = new Profesional(30208187, "Diego", 1134876521);
        Profesional profesional2 = new Profesional(30208178, "Leonel", 1134876556);
        Profesional profesional3 = new Profesional(30208189, "Alfredo", 1134876509);
        Persona persona1 = new Persona(29098765,"Dario",1156890642);
        Persona persona2 = new Persona(29098756,"Beatriz",1156890624);
        Persona persona3 = new Persona(29098732,"Gonzalo",1156890685);


        Set<Persona> personaSet = new HashSet<>();
        personaSet.add(persona1);
        personaSet.add(persona2);
        personaSet.add(persona3);
        Collections.sort(personaSet);
        personaSet.forEach(ven -> System.out.println(ven.toString()));


        Set<Paciente> pacienteSet = new HashSet<>();
        pacienteSet.add(paciente1);
        pacienteSet.add(paciente2);
        pacienteSet.add(paciente3);
        Collections.sort(pacienteSet);
        pacienteSet.forEach(ven -> System.out.println(ven.toString()));

        Set<Profesional> profesionalSet = new HashSet<>();
        profesionalSet.add(profesional1);
        profesionalSet.add(profesional2);
        profesionalSet.add(profesional3);
        Collections.sort(profesionalSet);
        profesionalSet.forEach(ven -> System.out.println(ven.toString()));
    }

        public static void buscarVendedorPorDNI (Integer dni, Set < Persona > persona ){

            if (dni == null) {
                System.out.println("ingrese un dni válido");
            } else {
                for (Persona personas : persona) {
                    if (personas.getDni(dni) {
                        System.out.println(personas.toString());


                    }
                }


            }
        }
}
