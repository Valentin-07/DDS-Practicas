package Domain;

import java.util.List;

public class Inscripcion {
    private Alumno unAlumno;
    private List <Materia> materias;

    public boolean aprobada(){
        return this.materias.stream().allMatch(unaMateria -> this.unAlumno.cumpleCorrelativas(unaMateria));
    }

    public Inscripcion(Alumno unAlumno, List<Materia> materias) {
        this.unAlumno = unAlumno;
        this.materias = materias;
    }

}
