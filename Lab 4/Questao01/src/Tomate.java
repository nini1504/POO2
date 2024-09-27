public class Tomate extends pizzaDecorator{
    public Tomate(Pizza pizza) {
        super(pizza);
    }
    @Override
    public String getDescricao() {
        return super.getDescricao()+" Tomate";
    }

    @Override
    public double getPreco(){
        return super.getPreco() + 4.00;
    }
}
