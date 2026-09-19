package sistemamatriculas;

import java.util.List;

public class Secretaria extends Usuario {

    private String registroFuncional;
    private Universidade universidade;

    public Secretaria(String nome, String login, String senha, String registroFuncional, Universidade universidade) {
        super(nome, login, senha);
        throw new UnsupportedOperationException("não implementado");
    }

    public Curso cadastrarCurso(String nome, int numeroCreditos) {
        throw new UnsupportedOperationException("não implementado");
    }

    public Disciplina cadastrarDisciplina(Curso curso, String nome) {
        throw new UnsupportedOperationException("não implementado");
    }

    public Curriculo gerarCurriculo(String semestre, List<Disciplina> disciplinas) {
        throw new UnsupportedOperationException("não implementado");
    }

    public void registrarAluno(Aluno aluno) {
        throw new UnsupportedOperationException("não implementado");
    }

    public void registrarProfessor(Professor professor) {
        throw new UnsupportedOperationException("não implementado");
    }

    public String getRegistroFuncional() {
        throw new UnsupportedOperationException("não implementado");
    }
}
