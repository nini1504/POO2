public class Etios implements IVehicle{
    @Override
    public void start() {
        System.out.println("Etios está ligando.");
    }

    @Override
    public void drive() {
        System.out.println("Etios está em movimento.");
    }

    @Override
    public void stop() {
        System.out.println("Etios está parando.");
    }
}
