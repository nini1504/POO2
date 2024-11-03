public class aeroporto implements Observer{
    @Override
    public void update(int temperatura, int umidade, int velocidade) {
        System.out.println(" Aeroporto interessado nas rajadas dos ventos.");
        System.out.println("Velocidade atual dos ventos: " + velocidade + "\n");
    }
}
