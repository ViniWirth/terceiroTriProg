package trabalhoHospital;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Paciente {
    private String nome;
    private LocalDate dataNascimento;
    private List<Atendimento> atendimentos;
    private boolean ativo;

    public Paciente(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.atendimentos = new ArrayList<>();
        this.ativo = true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) { // Adicionei o método setNome aqui
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public List<Atendimento> getAtendimentos() {
        return atendimentos;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void adicionarAtendimento(Atendimento atendimento) {
        atendimentos.add(atendimento);
    }

    @Override
    public String toString() {
        return "Paciente [Nome: " + nome + ", Data de Nascimento: " + dataNascimento + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Paciente paciente = (Paciente) obj;
        return nome.equalsIgnoreCase(paciente.nome);
    }
}
