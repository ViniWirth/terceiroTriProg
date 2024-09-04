package aula31.exemploAbstrato;

public class Principal {
    public static void main(String[] args) {
        Circulo c1 = new Circulo();
        c1.setRaio(5);
        System.out.println(c1);
        Retangulo r1 = new Retangulo();
        r1.setAltura(5);
        r1.setBase(7);
        System.out.println(r1);
    }
}
