package aula32;

public class Lista {
    private String[] elementos;
    private int tamanho;

    //construtor pra mudar o tamanho
    public Lista() {
        this(10); //define a capacidade inicial
    }

    public Lista(int capacidade){
        elementos = new String[capacidade];
        tamanho = 0;
    }

    private void aumentaCapacidade(){
        if(tamanho == elementos.length){
            String[] aux = new String[tamanho * 2];
            for(int i = 0; i < elementos.length; i++){
                aux[i] = elementos[i];
            }
            elementos = aux;
        }
    }

    public void adiciona(String elemento){
        aumentaCapacidade();
        elementos[tamanho] = elemento;
        tamanho++;
    }

    public void adiciona(int posicao, String elemento){
        aumentaCapacidade();
        if(posicao < 0 || posicao >= tamanho)
            throw new IllegalArgumentException("Posição " + posicao + " é inválida");
        for (int i = tamanho - 1; i >= posicao; i--){
            elementos[i + 1] = elementos[i];
        }
        elementos[posicao] = elemento;
        tamanho++;
    }

    public String remove(int posicao){
        if(posicao < 0 || posicao >= tamanho)
            throw new IllegalArgumentException("Posição " + posicao + " é inválida");
        String copia = elementos[posicao];
        for(int i = posicao; i < tamanho - 1; i++){
            elementos[i] = elementos[i + 1];
        }
        tamanho--;
        return copia;
    }

    public boolean remove(String elemento){
        int posicao = posicaoDe(elemento);
        if(posicao >= 0){
            remove(posicao);
            return true;
        }
        return false;
    }

    public int posicaoDe(String elemento){
        for(int i = 0; i < tamanho; i++)
            if(elementos[i].equals(elemento))
                return i;
        return -1;
    }

    public int ultimaPosicaoElemento(String elemento){
        for(int i = tamanho - 1; i >= 0; i--){
            if(elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    public String obter(int posicao){
        if(posicao < 0 || posicao >= tamanho)
            throw new IllegalArgumentException("Posição " + posicao + " é inválida");
        return elementos[posicao];
    }

    public boolean contem(String elemento){
        return posicaoDe(elemento) >= 0;
    }

    public void limpar(){
        elementos = new String[elementos.length]; // Mantém a capacidade inicial
        tamanho = 0;
    }

    public int tamanho(){
        return tamanho;
    }

    // Novo método: verifica se está vazia
    public boolean estaVazia(){
        return tamanho == 0;
    }

    @Override
    public String toString(){
        String retorno = "[";
        if(tamanho > 0){
            for(int i = 0; i < tamanho - 1; i++)
                retorno += elementos[i] + ", ";
            retorno += elementos[tamanho - 1];
        }
        return retorno + "]";
    }
}
