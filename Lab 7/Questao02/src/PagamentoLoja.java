public class PagamentoLoja extends PagamentoTemplate{
    @Override
    void processarPagamento(double valorTotal) {
        System.out.println("Processando pagamento na loja no valor de R$ " + valorTotal);
    }
    @Override
    void decidirEntrega() {
        System.out.println("Pedido retirado na loja. \n");
    }
}
