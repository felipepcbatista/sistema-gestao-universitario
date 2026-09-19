package sistemamatriculas;

import java.time.LocalDateTime;

public abstract class Usuario {

    protected String nome;
    protected String login;
    protected String senha;
    protected LocalDateTime createdAt;

    public Usuario(String nome, String login, String senha) {
        throw new UnsupportedOperationException("não implementado");
    }

    public boolean autenticar(String login, String senha) {
        throw new UnsupportedOperationException("não implementado");
    }

    public String getNome() {
        throw new UnsupportedOperationException("não implementado");
    }

    public String getLogin() {
        throw new UnsupportedOperationException("não implementado");
    }
}
