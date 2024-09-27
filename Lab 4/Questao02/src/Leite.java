public class Leite extends cafeDecorator{
    public Leite(Cafe cafe){
        super(cafe);
    }
    @Override
    public double getCusto(){
        return super.getCusto() + 2.00;
    }

    @Override
    public String getDescricao(){
        return super.getDescricao() + " Leite";
    }
}