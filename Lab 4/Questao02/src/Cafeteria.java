public class Cafeteria {
    public static void main(String[] args) {
        Cafe Capuccino = new Canela(new Leite(new cafeEspresso()));
        Cafe Mocha = new Chantilly(new Chocolate(new Leite(new cafeDecaf())));

        System.out.println("\nCapuccino:");
        System.out.println(Capuccino.getDescricao());
        System.out.println(Capuccino.getCusto());

        System.out.println("\nMocha:");
        System.out.println(Mocha.getDescricao());
        System.out.println(Mocha.getCusto());




    }
}