public class autenticacaoReal implements Autenticacao{
    @Override
    public void autenticar(String metodo, String usuario) {
        System.out.println("\n" + usuario + " autenticado via " + metodo + ".\n");
    }
}
//Essa classe tem a função de autenticar o usuário somente depois que o método é validado.