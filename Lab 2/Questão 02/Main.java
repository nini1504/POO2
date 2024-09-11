public class Main {
    public static void main(String[] args) {
        FabricanteCarroSingleton fabrica = new FabricanteCarroSingleton();

        // Fábrica da Toyota
        IVehicleMaker toyotaMaker = fabrica.getInstance("Toyota");
        IVehicle corollaCar = toyotaMaker.makeVehicle("Corolla");
        corollaCar.start();
        corollaCar.drive();
        corollaCar.stop();

        // Fábrica da Honda
        IVehicleMaker hondaMaker = fabrica.getInstance("Honda");
        IVehicle civicCar = hondaMaker.makeVehicle("Civic");
        civicCar.start();
        civicCar.drive();
        civicCar.stop();
    }
}
