public class PavaoAdapter implements Ave{
    public Pavao pavao;

    public PavaoAdapter (Pavao p){
        this.pavao = p;
    }
    @Override
    public void voar() {

    }
    @Override
    public void emitirSom() {
        pavao.cantar();
    }
}
