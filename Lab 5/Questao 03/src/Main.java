public class Main {
    public static void main(String[] args) {
        Autenticacao autenticacao = new autenticacaoProxy();
        //Teste para dois usuarios, somente o primeiro irá funcionar
        autenticacao.autenticar("Senha", "Usuário 123");
        autenticacao.autenticar("Token", "Usuário 456 ");
    }
}

//O exemplo implementa um sistema de autenticação utilizando o padrão Proxy. O objetivo é controlar os métodos de autenticação permitidos,
// como senha, biometria e SMS. O Proxy age como um intermediário, verificando se o método solicitado é válido. Se for, ele delega a
// autenticação para a classe real que executa o processo de autenticação. Caso contrário, rejeita a solicitação com uma mensagem de erro.