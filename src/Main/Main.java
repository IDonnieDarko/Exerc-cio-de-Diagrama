package Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando um telefone
        Telefone telefone = new Telefone();

        System.out.print("Digite o tipo de telefone: ");
        String tipoTelefone = scanner.nextLine();
        telefone.setTipo(tipoTelefone);

        System.out.print("Digite o DDD: ");
        String dddTelefone = scanner.nextLine();
        telefone.setDdd(dddTelefone);

        System.out.print("Digite o número: ");
        String numeroTelefone = scanner.nextLine();
        telefone.setNumero(numeroTelefone);

        // Criando um endereço
        Endereco endereco = new Endereco();

        System.out.print("Digite a rua: ");
        String ruaEndereco = scanner.nextLine();
        endereco.setRua(ruaEndereco);

        System.out.print("Digite a cidade: ");
        String cidadeEndereco = scanner.nextLine();
        endereco.setCidade(cidadeEndereco);

        System.out.print("Digite o estado: ");
        String estadoEndereco = scanner.nextLine();
        endereco.setEstado(estadoEndereco);

        // Criando um aluno
        Aluno aluno = new Aluno();

        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = scanner.nextLine();
        aluno.setNome(nomeAluno);

        System.out.print("Digite o CPF do aluno: ");
        String cpfAluno = scanner.nextLine();
        aluno.setCpf(cpfAluno);

        System.out.print("Digite o email do aluno: ");
        String emailAluno = scanner.nextLine();
        aluno.setEmail(emailAluno);

        aluno.adicionarTelefone(telefone);
        aluno.setEndereco(endereco);

        // Criando um curso
        Curso curso = new Curso();

        System.out.print("Digite o nome do curso: ");
        String nomeCurso = scanner.nextLine();
        curso.setNome(nomeCurso);

        // Definindo o curso do aluno
        aluno.setCurso(curso);

        // Solicitando e adicionando notas ao aluno
        for (int i = 0; i < 2; i++) {
            System.out.print("Digite a nota do aluno: ");
            double nota = scanner.nextDouble();
            aluno.adicionarNota(nota);
        }

        // Calculando e exibindo a média do aluno
        double media = aluno.calcularMedia();
        System.out.println("Média do aluno: " + media);

        // Criando um professor
        Professor professor = new Professor();

        System.out.print("Digite o nome do professor: ");
        scanner.nextLine(); // Limpar o buffer do scanner
        String nomeProfessor = scanner.nextLine();
        professor.setNome(nomeProfessor);

        System.out.print("Digite o CPF do professor: ");
        String cpfProfessor = scanner.nextLine();
        professor.setCpf(cpfProfessor);

        System.out.print("Digite o email do professor: ");
        String emailProfessor = scanner.nextLine();
        professor.setEmail(emailProfessor);

        professor.adicionarTelefone(telefone);
        professor.setEndereco(endereco);

        // Solicitando e adicionando cursos ao professor
        for (int i = 0; i < 2; i++) {
            Curso cursoProfessor = new Curso();

            System.out.print("Digite o nome do curso do professor: ");
            String nomeCursoProfessor = scanner.nextLine();
            cursoProfessor.setNome(nomeCursoProfessor);

            professor.adicionarCurso(cursoProfessor);
        }

        // Exibindo os dados do aluno e professor
        System.out.println("\nDados do Aluno:");
        aluno.imprimir();

        System.out.println("\nDados do Professor:");
        professor.imprimir();

        scanner.close();
    }
}
