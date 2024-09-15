public class calculadoraAdapter implements calculadora {

    private calculadoraBinaria calcBin;

    public calculadoraAdapter(calculadoraBinaria cb) {
        this.calcBin = cb;
    }

    @Override
    public int somar(int n1, int n2) {
        String num1 = Integer.toBinaryString(n1);
        String num2 = Integer.toBinaryString(n2);
        String r = calcBin.somar(num1, num2);
        return Integer.parseInt(r, 2);
    }

    @Override
    public int subtrair(int n1, int n2) {
        String num1 = Integer.toBinaryString(n1);
        String num2 = Integer.toBinaryString(n2);
        String r = calcBin.subtrair(num1, num2);
        return Integer.parseInt(r, 2);
    }

    @Override
    public int multiplicar(int n1, int n2) {
        return 0;
    }
}
