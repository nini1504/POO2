public class Cha extends CafeteriaTemplate{
    @Override
    void preparaBebida() {
        System.out.println("1.Escolha o sabor do chá\n2.Colocando o sachê na água quente");
    }

    @Override
    void adicionaCondimentos() {
        System.out.println("Adicione açúcar se preferir.");

    }
}
