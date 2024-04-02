package Domain;

import java.util.ArrayList;
import java.util.List;

public class Materia {
    private String nombre;
    private List <Materia> materiasCorrelativas;

    public Materia(String nombre, List<Materia> materiasCorrelativas) {
        this.nombre = nombre;
        this.materiasCorrelativas = new ArrayList<Materia>(materiasCorrelativas);
    }

    public List<Materia> getMateriasCorrelativas() {
        return materiasCorrelativas;
    }
}
