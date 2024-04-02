import Domain.Alumno;
import Domain.Inscripcion;
import Domain.Materia;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest {

    @Test
    public void quiereInscribirseAlgoritmo() {
        Materia algoritmo = new Materia("Algoritmo", new ArrayList<Materia>());
        Materia paradigma = new Materia("Paradigma", List.of(algoritmo));
        Materia disenio = new Materia("Diseño", List.of(paradigma));

        Alumno valentin = new Alumno(2035637, List.of());

        Inscripcion primeraInscripcion = new Inscripcion(valentin, List.of(algoritmo));


        Assertions.assertTrue(primeraInscripcion.aprobada());
    }

    @Test
    public void quiereInscribirseDisenioIngles2() {
        Materia algoritmo = new Materia("Algoritmo", new ArrayList<Materia>());
        Materia paradigma = new Materia("Paradigma", List.of(algoritmo));
        Materia disenio = new Materia("Diseño", List.of(paradigma));
        Materia ingles = new Materia("Ingles", new ArrayList<Materia>());
        Materia ingles2 = new Materia("Ingles2", List.of(ingles));

        Alumno bruno = new Alumno(2035637, List.of(algoritmo, paradigma, ingles));

        Inscripcion primeraInscripcion = new Inscripcion(bruno, List.of(disenio, ingles2));


        Assertions.assertTrue(primeraInscripcion.aprobada());
    }

    @Test
    public void noPuedeInscribirseParadigma() {
        Materia algoritmo = new Materia("Algoritmo", new ArrayList<Materia>());
        Materia paradigma = new Materia("Paradigma", List.of(algoritmo));
        Materia disenio = new Materia("Diseño", List.of(paradigma));

        Alumno valentin = new Alumno(2035637, List.of());

        Inscripcion primeraInscripcion = new Inscripcion(valentin, List.of(paradigma));


        Assertions.assertFalse(primeraInscripcion.aprobada());
    }

}