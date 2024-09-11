public class FabricanteCarroSingleton {

    private static IVehicleMaker toyotaInstance;
    private static IVehicleMaker hondaInstance;

    // Método Singleton que retorna instâncias únicas das montadoras
    public IVehicleMaker getInstance(String montadora) {
        
        if ("Toyota".equals(montadora)) {
            if (toyotaInstance == null) {
                toyotaInstance = new Toyota();  // Instancia a fábrica Toyota
            }
            return toyotaInstance;
        }
        if ("Honda".equals(montadora)) {
            if (hondaInstance == null) {
                hondaInstance = new Honda();  // Instancia a fábrica Honda
            }
            return hondaInstance;
        }
        return null; // Caso a montadora não seja válida
    }
}

// O singleton foi utilizado para controlar a quantidade e as intancias unicas
// de cada objeto desejado
