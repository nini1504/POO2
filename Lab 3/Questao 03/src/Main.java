public class Main {
    public static void main(String[] args) {
    carroEletrico CarEletrico = new Tesla();
    carro tesla = new carroEletricoAdapter(CarEletrico);

    tesla.ligar();
    tesla.acelerar();
    tesla.fazerBarulho();
    tesla.alimentar();

    carroCombustao CarCombustao = new Ferrari();
    carro ferrari = new carroCombustaoAdapter(CarCombustao);

    ferrari.ligar();
    ferrari.acelerar();
    ferrari.fazerBarulho();
    ferrari.alimentar();
    }
}