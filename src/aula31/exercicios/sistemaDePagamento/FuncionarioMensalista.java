package aula31.exercicios.sistemaDePagamento;

public class FuncionarioMensalista extends Funcionario implements Pagamento {

    public FuncionarioMensalista(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public double processarPagamento() {
        return calcularSalario();
    }
}

