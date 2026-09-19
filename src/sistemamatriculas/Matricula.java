package sistemamatriculas;

import java.time.LocalDateTime;

public class Matricula {

    private Aluno aluno;
    private Disciplina disciplina;
    private TipoMatricula tipo;
    private StatusMatricula status;
    private LocalDateTime dataMatricula;
    private LocalDateTime dataCancelamento;

    public Matricula(Aluno aluno, Disciplina disciplina, TipoMatricula tipo) {
        throw new UnsupportedOperationException("não implementado");
    }

    public void cancelar() {
        throw new UnsupportedOperationException("não implementado");
    }

    public Aluno getAluno() {
        throw new UnsupportedOperationException("não implementado");
    }

    public Disciplina getDisciplina() {
        throw new UnsupportedOperationException("não implementado");
    }

    public TipoMatricula getTipo() {
        throw new UnsupportedOperationException("não implementado");
    }

    public StatusMatricula getStatus() {
        throw new UnsupportedOperationException("não implementado");
    }
}
