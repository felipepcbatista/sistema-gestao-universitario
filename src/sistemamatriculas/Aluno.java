package sistemamatriculas;

import java.util.List;

public class Aluno extends Usuario {

    private String matricula;

    public Aluno(String nome, String login, String senha, String matricula) {
        super(nome, login, senha);
        throw new UnsupportedOperationException("não implementado");
    }

    public Curriculo consultarCurriculo(String semestre) {
        throw new UnsupportedOperationException("não implementado");
    }

    public Matricula matricularEmDisciplina(Disciplina disciplina, TipoMatricula tipo) {
        throw new UnsupportedOperationException("não implementado");
    }

    public void cancelarMatricula(Matricula matricula) {
        throw new UnsupportedOperationException("não implementado");
    }

    public List<Matricula> listarMinhasMatriculas() {
        throw new UnsupportedOperationException("não implementado");
    }

    public String getMatricula() {
        throw new UnsupportedOperationException("não implementado");
    }
}
