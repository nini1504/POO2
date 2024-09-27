public class Chocolate extends cafeDecorator{

    public Chocolate(Cafe cafe){
        super(cafe);
    }
    @Override
    public double getCusto(){
        return super.getCusto() + 5.99;
    }
    @Override
    public String getDescricao(){
        return super.getDescricao() + " Chocolate";
    }

}
