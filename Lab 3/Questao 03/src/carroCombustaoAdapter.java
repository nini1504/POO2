public class carroCombustaoAdapter implements carro{
    private carroCombustao CarroCombustao;
    public carroCombustaoAdapter(carroCombustao cb){
        this.CarroCombustao = cb;
    }
    @Override
    public void ligar() {
        CarroCombustao.ligar();
    }

    @Override
    public void acelerar() {
        CarroCombustao.acelerar();
    }

    @Override
    public void fazerBarulho() {
        CarroCombustao.fazerBarulho();
    }

    public void alimentar(){
        CarroCombustao.abastecer();
    }
}
