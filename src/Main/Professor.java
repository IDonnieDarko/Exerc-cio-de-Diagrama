
package Main;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa {
    private List<Curso> cursos;

    public Professor() {
        cursos = new ArrayList<>();
    }

    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Cursos:");
        for (Curso curso : cursos) {
            System.out.println(curso.getNome());
        }
    }
}