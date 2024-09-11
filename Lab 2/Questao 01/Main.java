public class Main {
    public static void main(String[] args) {
        // Fábrica da Apple
        FabricanteCelular apple = FabricanteSingleton.getInstance("apple");
        Celular iPhoneS = apple.constroiCelular("IPhoneS");
        iPhoneS.fazLigacao();
        iPhoneS.tiraFoto();

        // Fábrica da Samsung
        FabricanteCelular samsung = FabricanteSingleton.getInstance("samsung");
        Celular galaxy20 = samsung.constroiCelular("Galaxy20");
        galaxy20.fazLigacao();
        galaxy20.tiraFoto();
    }
}