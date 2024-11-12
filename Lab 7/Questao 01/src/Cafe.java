public class Cafe extends CafeteriaTemplate {
    @Override
    void preparaBebida() {
        System.out.println("1.Colocando o pó na água\n2.Coando o café");
    }

    @Override
    void adicionaCondimentos() {
        System.out.println("Adicione açúcar se preferir.");
    }
}
