public class Pizzaria {
    public static void main(String[] args) {

        Pizza marguerita = new Queijo(new Tomate(new massaFina()));
        Pizza portuguesa = new Queijo(new Tomate(new Ovo(new massaEspessa())));

        System.out.println(marguerita.getDescricao());
        System.out.println(marguerita.getPreco());
        System.out.println(marguerita.getTamanho() + " pedaços\n");

        System.out.println(portuguesa.getDescricao());
        System.out.println(portuguesa.getPreco());
        System.out.println(portuguesa.getTamanho()+ " pedaços\n");


    }
}