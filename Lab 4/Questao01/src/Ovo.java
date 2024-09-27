public class Ovo extends pizzaDecorator{
    public Ovo(Pizza pizza) {
        super(pizza);
    }
    @Override
    public String getDescricao() {
        return super.getDescricao()+" Ovo";
    }

    @Override
    public double getPreco(){
        return super.getPreco() + 3.00;
    }
}
