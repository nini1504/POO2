public class PatoAdapter implements Ave{
    public Pato pato;

    public PatoAdapter(Pato p){
        this.pato = p;
    }

    @Override
    public void voar() {
        pato.voar();
    }

    @Override
    public void emitirSom() {
        pato.grasnar();
    }
}
