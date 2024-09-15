public class Main {
    public static void main(String[] args) {
        Pato patoDomestico = new PatoDomestico();
        Ave pato = new PatoAdapter(patoDomestico);

        pato.emitirSom();
        pato.voar();

        Pavao pavaoAzul = new PavaoAzul();
        Ave pavao = new PavaoAdapter(pavaoAzul);

        pavao.emitirSom();
        pavao.voar();
    }
}
