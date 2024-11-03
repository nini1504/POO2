public class prefeitura implements Observer {
    @Override
    public void update(int temperatura, int umidade, int velocidade) {
        System.out.println("Prefeitura interessada na umidade do ar. ");
        System.out.println("Umidade atual do ar: " + umidade + "\n");

    }
}
