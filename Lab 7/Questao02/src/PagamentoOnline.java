public class PagamentoOnline extends PagamentoTemplate{
    @Override
    void processarPagamento(double valorTotal) {
        System.out.println("Processando pagamento online no valor de: R$ " + valorTotal);
    }

    @Override
    void decidirEntrega() {
        System.out.println("Entrega via Correios\n");
    }
}
