package questao1;

public class Main {

    public static void main(String[] args) {

        Professor professor = new Professor("Guilherme","guilherme@hotmail.com","12345",150,5);
        System.out.print(professor.MostrarProfessor());

        Aluno aluno = new Aluno("João", "joao@hotmail.com","54321",3,701);
        System.out.print(aluno.MostrarAluno());
    }

}
