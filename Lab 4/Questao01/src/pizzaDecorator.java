public class pizzaDecorator implements Pizza{
    protected Pizza pizza;
    public pizzaDecorator(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao();
    }

    @Override
    public double getPreco() {
        return pizza.getPreco();
    }

    @Override
    public int getTamanho() {
        return pizza.getTamanho();
    }
}
