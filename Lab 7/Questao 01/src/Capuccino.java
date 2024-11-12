public class Capuccino extends CafeteriaTemplate{
    @Override
    void preparaBebida() {
        System.out.println("1.Colocando o pó na água\n2.Adicionando o leite");
    }

    @Override
    void adicionaCondimentos() {
        System.out.println("Adicionando canela e chocolate.");
    }
}
