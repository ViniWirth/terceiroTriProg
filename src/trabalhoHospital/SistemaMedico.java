package trabalhoHospital;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaMedico {
    private static List<Paciente> pacientes = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("1. Incluir paciente");
            System.out.println("2. Alterar paciente");
            System.out.println("3. Realizar atendimento");
            System.out.println("4. Listar pacientes");
            System.out.println("5. Mostrar paciente");
            System.out.println("6. Apagar paciente");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    incluirPaciente();
                    break;
                case 2:
                    alterarPaciente();
                    break;
                case 3:
                    realizarAtendimento();
                    break;
                case 4:
                    listarPacientes();
                    break;
                case 5:
                    mostrarPaciente();
                    break;
                case 6:
                    apagarPaciente();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private static void incluirPaciente() {
        System.out.print("Nome do paciente: ");
        String nome = scanner.nextLine();
        System.out.print("Data de nascimento (AAAA-MM-DD): ");
        LocalDate dataNascimento = LocalDate.parse(scanner.nextLine());

        Paciente novoPaciente = new Paciente(nome, dataNascimento);
        pacientes.add(novoPaciente);
        System.out.println("Paciente incluído com sucesso!");
    }

    private static void alterarPaciente() {
        Paciente paciente = buscarPaciente();
        if (paciente != null) {
            System.out.print("Novo nome: ");
            paciente.setNome(scanner.nextLine());
            System.out.println("Dados do paciente alterados com sucesso!");
        }
    }

    private static Paciente buscarPaciente() {
        System.out.print("Nome do paciente: ");
        String nome = scanner.nextLine();
        for (Paciente p : pacientes) {
            if (p.getNome().equalsIgnoreCase(nome) && p.isAtivo()) {
                return p;
            }
        }
        System.out.println("Paciente não encontrado ou está desativado");
        return null;
    }

    private static void realizarAtendimento() {
        Paciente paciente = buscarPaciente();
        if (paciente != null) {
            System.out.print("Descrição do Atendimento: ");
            String descricao = scanner.nextLine();
            Atendimento atendimento = new Atendimento(LocalDate.now(), descricao);
            paciente.adicionarAtendimento(atendimento);
            System.out.println("Atendimento registrado com sucesso!");
        }
    }

    private static void listarPacientes() {
        System.out.println("Lista de Pacientes Ativos");
        for (Paciente paciente : pacientes) {
            if (paciente.isAtivo()) {
                System.out.println(paciente);
            }
        }
    }

    private static void mostrarPaciente() {
        Paciente paciente = buscarPaciente();
        if (paciente != null) {
            System.out.println(paciente);
            List<Atendimento> atendimentos = paciente.getAtendimentos();
            for (int i = 0; i < atendimentos.size(); i += 5) {
                for (int j = i; j < i + 5 && j < atendimentos.size(); j++) {
                    System.out.println(atendimentos.get(j));
                }
                if (i + 5 < atendimentos.size()) {
                    System.out.print("Pressione Enter para continuar...");
                    scanner.nextLine();
                }
            }
        }
    }

    private static void apagarPaciente() {
        Paciente paciente = buscarPaciente();
        if (paciente != null) {
            System.out.println("Tem certeza que deseja apagar o paciente? (S/N)");
            String resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("S")) {
                paciente.setAtivo(false);
                System.out.println("Paciente desativado com sucesso!");
            }
        }
    }
}
