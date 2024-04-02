package Domain;

import java.util.List;

public class Alumno {
    private Integer legajo;
    private List <Materia> materiasCursadas;

    public boolean cumpleCorrelativas(Materia unaMateria){
        return unaMateria.getMateriasCorrelativas().isEmpty() || materiasCursadas.containsAll(unaMateria.getMateriasCorrelativas());
    }

    public Alumno(Integer legajo, List<Materia> materiasCursadas) {
        this.legajo = legajo;
        this.materiasCursadas = materiasCursadas;
    }

}
