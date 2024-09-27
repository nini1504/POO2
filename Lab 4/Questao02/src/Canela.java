public class Canela extends cafeDecorator{

    public Canela(Cafe cafe){
        super(cafe);
    }
    @Override
    public double getCusto() {
       return super.getCusto() + 3.50;
    }
    @Override
    public String getDescricao(){
        return super.getDescricao()+ " Canela";
    }
}
