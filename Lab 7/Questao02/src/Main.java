public class Main {
    public static void main(String[] args) {
       PagamentoTemplate pagOnline = new PagamentoOnline();
       PagamentoTemplate pagLoja = new PagamentoLoja();
       PagamentoTemplate pagCripto =  new PagamentoCriptomoedas();

       pagOnline.finalizarPedido(5, 9.99);
       pagLoja.finalizarPedido(3, 21.50);
       pagCripto.finalizarPedido(8, 49.90);
    }
}