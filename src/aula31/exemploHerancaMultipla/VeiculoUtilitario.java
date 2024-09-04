package aula31.exemploHerancaMultipla;

public class VeiculoUtilitario implements VeiculoPasseio, VeiculoCarga{

    @Override
    public void andar() {

    }

    @Override
    public void parar() {

    }

    @Override
    public int obterVelocidade() {
        return 0;
    }

    @Override
    public void carregar() {

    }

    @Override
    public void descarregar() {

    }

    @Override
    public int obterCapacidadeCarga() {
        return 0;
    }

    @Override
    public void embarcarPassageiro() {

    }

    @Override
    public void desembarcarPassageiro() {

    }

    @Override
    public int obterCapacidadePassageiros() {
        return 0;
    }
}