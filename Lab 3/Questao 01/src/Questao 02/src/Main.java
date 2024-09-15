public class Main {
    public static void main(String[] args) {
        calculadora CalculadoraDecimal = new calculadoraDecimal();
        System.out.println(CalculadoraDecimal.somar(10, 7));
        System.out.println(CalculadoraDecimal.subtrair(10, 7));
        System.out.println(CalculadoraDecimal.multiplicar(10, 7));

        calculadora CalculadoraBin = new calculadoraAdapter(new calculadoraBinaria());
        System.out.println(Integer.toBinaryString(CalculadoraBin.somar(10,7)));
        System.out.println(Integer.toBinaryString(CalculadoraBin.subtrair(10,7)));
        CalculadoraBin.multiplicar(10,7);

    }
}