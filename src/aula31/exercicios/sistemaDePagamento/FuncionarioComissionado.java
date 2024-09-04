package aula31.exercicios.sistemaDePagamento;

public class FuncionarioComissionado extends Funcionario implements Pagamento {

    private double vendas;
    private double taxaComissao;

    public FuncionarioComissionado(String nome, double salarioBase, double vendas, double taxaComissao) {
        super(nome, salarioBase);
        this.vendas = vendas;
        this.taxaComissao = taxaComissao;
    }

    public double calcularSalario() {
        return salarioBase + (vendas * taxaComissao);
    }

    public double processarPagamento() {
        return calcularSalario();
    }
}

