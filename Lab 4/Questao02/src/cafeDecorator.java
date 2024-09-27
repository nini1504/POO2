public class cafeDecorator implements Cafe{

    protected Cafe cafe;

    public cafeDecorator(Cafe cafe){
        this.cafe = cafe;
    }

    @Override
    public double getCusto() {
        return cafe.getCusto();
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao();
    }
}
