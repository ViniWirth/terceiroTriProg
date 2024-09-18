package aula32;

public class Main {
    public static void main(String[] args) {
        Lista l1 = new Lista();
        l1.adiciona("A");
        l1.adiciona("B");
        l1.adiciona("C");
        l1.adiciona("D");
        l1.adiciona("E");

        System.out.println("Lista inicial: " + l1);

        //obter
        System.out.println("Elemento da posição 1: " + l1.obter(1));

        try {
            System.out.println("Elemento da posição 11: " + l1.obter(11));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        //adiciona
        l1.adiciona(1, "B");
        System.out.println("Lista após adicionar 'B' na posição 1: " + l1);

        //remove
        System.out.println("Removendo o elemento da posição 3: " + l1.remove(3));
        System.out.println("Lista após remover da posição 3: " + l1);

        //posicaoDe
        System.out.println("Posição do 'B' na lista: " + l1.posicaoDe("B"));
        System.out.println("Posição do 'b' na lista: " + l1.posicaoDe("b"));

        //contem
        System.out.println("Lista contém 'A'? " + l1.contem("A"));
        System.out.println("Lista contém 'Z'? " + l1.contem("Z"));

        //remove por elemento
        System.out.println("Removendo o elemento 'B': " + l1.remove("B"));
        System.out.println("Lista após remover o elemento 'B': " + l1);
        System.out.println("Tentando remover 'Z': " + l1.remove("Z"));

        //limpar
        l1.limpar();
        System.out.println("Lista após limpar: " + l1);

        //estaVazia
        System.out.println("Lista está vazia? " + l1.estaVazia());

        //tamanho
        l1.adiciona("X");
        l1.adiciona("Y");
        System.out.println("Tamanho da lista: " + l1.tamanho());

        //ultimaPosicaoElemento
        l1.adiciona("X");
        System.out.println("Última posição do 'X': " + l1.ultimaPosicaoElemento("X"));
    }
}
