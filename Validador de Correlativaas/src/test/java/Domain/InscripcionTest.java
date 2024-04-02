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
        Materia algoritmo = new Materia("algoritmo", new ArrayList<Materia>());
        Materia paradigma = new Materia("paradigma", List.of(algoritmo));
        Materia disenio = new Materia("diseño", List.of(paradigma));

        Alumno valentin = new Alumno(4567, List.of());

        Inscripcion primeraInscripcion = new Inscripcion(valentin, List.of(algoritmo));


        Assertions.assertTrue(primeraInscripcion.aprobada());
    }

    @Test
    public void quiereInscribirseDisenio() {
        Materia algoritmo = new Materia("algoritmo", new ArrayList<Materia>());
        Materia paradigma = new Materia("paradigma", List.of(algoritmo));
        Materia disenio = new Materia("diseño", List.of(paradigma));

        Alumno valentin = new Alumno(4567, List.of(algoritmo, paradigma));

        Inscripcion primeraInscripcion = new Inscripcion(valentin, List.of(disenio));


        Assertions.assertTrue(primeraInscripcion.aprobada());
    }

    @Test
    public void noPuedeInscribirseParadigma() {
        Materia algoritmo = new Materia("algoritmo", new ArrayList<Materia>());
        Materia paradigma = new Materia("paradigma", List.of(algoritmo));
        Materia disenio = new Materia("diseño", List.of(paradigma));

        Alumno valentin = new Alumno(4567, List.of());

        Inscripcion primeraInscripcion = new Inscripcion(valentin, List.of(paradigma));


        Assertions.assertFalse(primeraInscripcion.aprobada());
    }

}