public class Chantilly extends cafeDecorator{
    public Chantilly(Cafe cafe){
        super(cafe);
    }
    @Override
    public double getCusto(){
        return super.getCusto() + 8.00;
    }
    @Override
    public String getDescricao(){
        return super.getDescricao() + " Chantilly";
    }
}
