package aula31.exemploHerancaMultipla;

public interface VeiculoCarga extends Veiculo{
    void carregar();
    void descarregar();
    int obterCapacidadeCarga();
}