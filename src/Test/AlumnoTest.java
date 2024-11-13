package Test;

import Entity.Alumno;
import Entity.EdadInvalidaException;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.*;

class AlumnoTest {
    static Alumno alumno = new Alumno("Jorge","Altamirano","jorge@gmail.com",21);
@BeforeAll
static void iniciando(){
    System.out.println("Esto se ejecuta una sola vez antes de todos los tests");
}
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void mostrarNombreCompleto() {
        String resultado = alumno.mostrarNombreCompleto();
        assertEquals(resultado,"Altamirano,Jorge");
    }

    @org.junit.jupiter.api.Test
    void esMayorEdad() throws EdadInvalidaException {
        assertTrue(alumno.esMayorEdad());
    }
}