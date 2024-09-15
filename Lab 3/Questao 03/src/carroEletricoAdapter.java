public class carroEletricoAdapter implements carro{
    private carroEletrico CarroEletrico;
    public carroEletricoAdapter(carroEletrico ce){
        this.CarroEletrico = ce;
    }
    @Override
    public void ligar() {
        CarroEletrico.ligar();
    }

    @Override
    public void acelerar() {
        CarroEletrico.acelerar();
    }

    @Override
    public void fazerBarulho() {

    }

    public void alimentar(){
        CarroEletrico.carregar();
    }
}
