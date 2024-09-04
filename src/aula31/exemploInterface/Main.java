package aula31.exemploInterface;

public class Main {
    public static void main(String[] args) {
        Vetor v1 = new Vetor(10);

        v1.adiciona("Elemento 1");
        v1.adiciona("Elemento 2");
        v1.adiciona("Elemento 3");
        v1.adiciona("Elemento 4");
        v1.adiciona("Elemento 5");
        System.out.println("Tamanho da lista: "+v1.tamanho());
        System.out.println(v1);
        System.out.println("Removendo elemento "+v1.remove());
        System.out.println(v1);

        Lista l1 = new Vetor(5);
        l1.adiciona("Teste 1");
        l1.adiciona("Teste 2");
        l1.remove();
        l1.tamanho();
        System.out.println(l1);

    }
}
