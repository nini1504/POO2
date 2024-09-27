public class massaFina implements Pizza{

    @Override
    public String getDescricao() {
        return "Massa fina -";
    }

    @Override
    public double getPreco() {
        return 49.99;
    }

    @Override
    public int getTamanho() {
        return 6;
    }
}
