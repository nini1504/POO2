public class Ferrari implements carroCombustao{
    @Override
    public void ligar() {
        System.out.println("Ferrari está ligando.");
    }

    @Override
    public void acelerar() {
        System.out.println("Ferrari está acelerando.");
    }

    @Override
    public void fazerBarulho() {
        System.out.println("Ferrari está fazendo barulho.");
    }

    @Override
    public void abastecer() {
        System.out.println("Ferrari está abastecendo.");
    }
}
