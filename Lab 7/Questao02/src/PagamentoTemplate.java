abstract class PagamentoTemplate {

    abstract void processarPagamento(double valorTotal);
    abstract void decidirEntrega();
    public void finalizarPedido(int quantidade, double valorItem) {
        double valorTotal = quantidade * valorItem;
        processarPagamento(valorTotal);
        decidirEntrega();
    }
}

