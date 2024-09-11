import java.util.Objects;

public class FabricanteSingleton {

    private static FabricanteCelular appleInstance;
    private static FabricanteCelular samsungInstance;

    public static FabricanteCelular getInstance(String fabricante) {
        if (Objects.equals(fabricante, "apple")) {
            if (appleInstance == null) {
                appleInstance = new apple();
            }
            return appleInstance;
        } else if (Objects.equals(fabricante, "samsung")) {
            if (samsungInstance == null) {
                samsungInstance = new samsung();
            }
            return samsungInstance;
        }
        return null;
    }
}
