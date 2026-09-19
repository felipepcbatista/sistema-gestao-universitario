package sistemamatriculas;

public class Disciplina {

    private String nome;
    private int vagasMaximas;
    private int minimoParaAtivar;
    private StatusDisciplina status;
    private Professor professor;

    public Disciplina(String nome, int vagasMaximas, int minimoParaAtivar, Professor professor) {
        throw new UnsupportedOperationException("não implementado");
    }

    public int contarMatriculasAtivas() {
        throw new UnsupportedOperationException("não implementado");
    }

    public boolean temVagaDisponivel() {
        throw new UnsupportedOperationException("não implementado");
    }

    public void avaliarFechamentoPeriodo() {
        throw new UnsupportedOperationException("não implementado");
    }

    public String getNome() {
        throw new UnsupportedOperationException("não implementado");
    }

    public int getVagasMaximas() {
        throw new UnsupportedOperationException("não implementado");
    }

    public int getMinimoParaAtivar() {
        throw new UnsupportedOperationException("não implementado");
    }

    public StatusDisciplina getStatus() {
        throw new UnsupportedOperationException("não implementado");
    }

    public Professor getProfessor() {
        throw new UnsupportedOperationException("não implementado");
    }
}
