public class calculadoraBinaria {

    public String somar(String n1, String n2) {
        int num1 = Integer.parseInt(n1, 2);
        int num2 = Integer.parseInt(n2, 2);
        int resultado = num1 + num2;
        return Integer.toBinaryString(resultado);
    }

    public String subtrair(String n1, String n2) {
        int num1 = Integer.parseInt(n1, 2);
        int num2 = Integer.parseInt(n2, 2);
        int resultado = num1 - num2;
        return Integer.toBinaryString(resultado);
    }
}
