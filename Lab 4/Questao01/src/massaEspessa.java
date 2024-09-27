public class massaEspessa implements Pizza{
    @Override
    public String getDescricao() {
        return "Massa espessa -";
    }

    @Override
    public double getPreco() {
        return 69.99;
    }

    @Override
    public int getTamanho() {
        return 8;
    }
}
