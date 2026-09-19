package sistemamatriculas;

import java.time.LocalDateTime;
import java.util.List;

public class Curriculo {

    private String semestre;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private List<Disciplina> disciplinas;

    public Curriculo(String semestre) {
        throw new UnsupportedOperationException("não implementado");
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        throw new UnsupportedOperationException("não implementado");
    }

    public String getSemestre() {
        throw new UnsupportedOperationException("não implementado");
    }

    public List<Disciplina> getDisciplinas() {
        throw new UnsupportedOperationException("não implementado");
    }
}
