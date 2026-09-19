package sistemamatriculas;

import java.util.List;

public class Professor extends Usuario {

    private String registroFuncional;

    public Professor(String nome, String login, String senha, String registroFuncional) {
        super(nome, login, senha);
        throw new UnsupportedOperationException("não implementado");
    }

    public List<Aluno> consultarAlunosMatriculados(Disciplina disciplina) {
        throw new UnsupportedOperationException("não implementado");
    }

    public String getRegistroFuncional() {
        throw new UnsupportedOperationException("não implementado");
    }
}
