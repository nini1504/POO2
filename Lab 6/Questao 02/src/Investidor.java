public class Investidor implements Observer {

    private int id;
    private double limiteMin;
    private double limiteMax;
    private AcaoBroker AB;

    public Investidor(int id, double min, double max, AcaoBroker AB) {
        this.id = id;
        this.limiteMin = min;
        this.limiteMax = max;
        this.AB = AB;
    }

    @Override
    public void update(double precoAcao) {
        System.out.println("Preço máximo das ações do investidor " + id + ": " + limiteMax);
        if (precoAcao >= limiteMax) {
            AB.vender(this.id);
        } else {
            System.out.printf("Ações do investidor %d não devem ser vendidas agora!\n\n", this.id);
        }
    }
}
