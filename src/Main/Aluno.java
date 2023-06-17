package Main;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
    private Curso curso;
    private List<Double> notas;

    public Aluno() {
        notas = new ArrayList<>();
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Curso getCurso() {
        return curso;
    }

    public void adicionarNota(double nota) {
        notas.add(nota);
    }

    public List<Double> getNotas() {
        return notas;
    }

    public double calcularMedia() {
        if (notas.isEmpty()) {
            return 0.0;
        }

        double soma = 0.0;
        for (Double nota : notas) {
            soma += nota;
        }

        return soma / notas.size();
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Curso: " + curso.getNome());
        System.out.println("Notas:");
        for (Double nota : notas) {
            System.out.println(nota);
        }
    }
}