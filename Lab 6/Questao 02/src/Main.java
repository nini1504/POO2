public class Main {
    public static void main(String[] args) {
        Subject acao = new Acao();
        AcaoBroker broker = new AcaoBroker();

        Observer invest1 = new Investidor(1, 300.00, 1000.00, broker);
        Observer invest2 = new Investidor(2, 600.00, 3000.00, broker);

        acao.addObserver(invest1);
        acao.addObserver(invest2);

        acao.setPreco(2000.00); // Somente o 1 deve vender
        acao.setPreco(3500.00); // Ambos devem vender
    }
}
