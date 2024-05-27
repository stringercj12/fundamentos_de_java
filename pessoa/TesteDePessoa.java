package pessoa;

public class TesteDePessoa {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.setCpf("33322211");
        professor.setNome("Daniele");
        professor.setIdade(33);
        professor.setSalario(50000);

        System.out.println(professor.imprimirDadosDaPessoa());

        Aluno aluno = new Aluno();

        aluno.setCpf("11112323");
        aluno.setNome("Fernanda");
        aluno.setIdade(19);
        aluno.setMatricula("23230");

        System.out.println(aluno.imprimirDadosDaPessoa());
    }
}
