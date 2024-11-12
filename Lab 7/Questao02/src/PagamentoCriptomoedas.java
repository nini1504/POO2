public class PagamentoCriptomoedas extends PagamentoTemplate{
    @Override
    void processarPagamento(double valorTotal) {
        System.out.println("Processando pagamento em criptomoeds no valor de R$ " + valorTotal);
    }

    @Override
    void decidirEntrega() {
        System.out.println("Entrega via transportadora.\n");
    }
}
