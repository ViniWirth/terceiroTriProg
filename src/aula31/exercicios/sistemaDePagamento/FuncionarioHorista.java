package aula31.exercicios.sistemaDePagamento;

public class FuncionarioHorista extends Funcionario implements Pagamento {

    private int horasTrabalhadas;
    private double valorHora;

    public FuncionarioHorista(String nome, int horasTrabalhadas, double valorHora) {
        super(nome, 0); // O salário base não é utilizado diretamente nesta classe
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public double calcularSalario() {
        return horasTrabalhadas * valorHora;
    }

    public double processarPagamento() {
        return calcularSalario();
    }
}
