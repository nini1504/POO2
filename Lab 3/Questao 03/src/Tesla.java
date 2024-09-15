public class Tesla implements carroEletrico{
    @Override
    public void ligar() {
        System.out.println("Tesla está ligando.");
    }

    @Override
    public void acelerar() {
        System.out.println("Tesla está acelerando.");
    }

    @Override
    public void carregar() {
        System.out.println("Tesla está carregando.");
    }
}
