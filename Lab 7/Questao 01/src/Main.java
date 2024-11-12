public class Main {
    public static void main(String[] args) {

        CafeteriaTemplate cafe = new Cafe();
        CafeteriaTemplate cha = new Cha();
        CafeteriaTemplate capuccino = new Capuccino();

        cafe.preparaReceita(cafe);
        cha.preparaReceita(cha);
        capuccino.preparaReceita(capuccino);
    }
}