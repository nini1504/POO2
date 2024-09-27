public class Queijo extends pizzaDecorator{
    public Queijo(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao()+" Queijo";
    }

    @Override
    public double getPreco(){
        return super.getPreco() + 8.00;
    }
}
