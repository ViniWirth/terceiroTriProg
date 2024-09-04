package aula31.exercicios.sistemaDePagamento;

public class SistemaPagamento {

    public static void main(String[] args) {
        Funcionario mensalista = new FuncionarioMensalista("João", 3000.00);
        Funcionario horista = new FuncionarioHorista("Maria", 160, 25.00);
        Funcionario comissionado = new FuncionarioComissionado("Carlos", 2000.00, 5000.00, 0.10);

        System.out.println("Pagamento Mensalista: " + mensalista.calcularSalario());
        System.out.println("Pagamento Horista: " + horista.calcularSalario());
        System.out.println("Pagamento Comissionado: " + comissionado.calcularSalario());
    }
}

