import java.util.ArrayList;
import java.util.List;

public class autenticacaoProxy implements Autenticacao {
    private Autenticacao AutenticacaoReal;
    private List<String> metodosAceitos;

    public autenticacaoProxy() {
        this.AutenticacaoReal = new autenticacaoReal();
        this.metodosAceitos = new ArrayList<>();
        this.metodosAceitos.add("Senha");
        this.metodosAceitos.add("Biometria");
        this.metodosAceitos.add("SMS");
    }

    @Override
    public void autenticar(String metodo, String usuario) {
        if (metodosAceitos.contains(metodo)) {
            AutenticacaoReal.autenticar(metodo, usuario);
        } else {
            System.out.println("O método de autenticação " + metodo + " não é válido.");
            System.out.println("O usuário " + usuario + "não pode ser autenticado.");

        }
    }
}

//A classe AutenticacaoProxy age como um intermediário ao capturar a solicitação de autenticação feita pelo cliente.
//Essa classe faz a verificação se o método escolhido pelo usuário realmente é válida, se for, delega para a autenticação real, se não, mostra uma mensagem de erro.
