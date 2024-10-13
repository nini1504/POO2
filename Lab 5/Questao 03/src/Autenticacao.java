public interface Autenticacao {
    void autenticar(String metodo, String usuario);
}

// O uso da interface aqui permite que o cliente utilize o mesmo método, independentemente de estar interagindo
// com o proxy ou com a autenticação real.
