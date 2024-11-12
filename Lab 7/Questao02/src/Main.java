/*O padrão Template define uma estrutura base, um "esqueleto", para a classe pai, 
e delega a implementação de outras funcionalidades para suas subclasses, enquanto que o padrão Decorator
permite adicionar novas funcionalidades, comportamentos adicionais a objetos de forma dinâmica e flexível,
sem alterar a classe base, e utilizando composição ao invés de herança.
*/

public class Main {
    public static void main(String[] args) {
       PagamentoTemplate pagOnline = new PagamentoOnline();
       PagamentoTemplate pagLoja = new PagamentoLoja();
       PagamentoTemplate pagCripto =  new PagamentoCriptomoedas();

       pagOnline.finalizarPedido(5, 9.99);
       pagLoja.finalizarPedido(3, 21.50);
       pagCripto.finalizarPedido(8, 49.90);
    }
}
