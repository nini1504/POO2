public class Cinemateca {
    Amplificador amplificador = new Amplificador();
    Luzes luzes = new Luzes();
    Pipoqueira pipoqueira = new Pipoqueira();
    Player player = new Player();
    Projetor projetor = new Projetor();
    Telao telao = new Telao();

    void iniciarRotina(String filme, int volume){
        System.out.println("\nIniciando sessão...\n");
        pipoqueira.ligar();
        pipoqueira.estourarPipoca();
        luzes.desligar();
        telao.abaixar();
        projetor.ligar();
        amplificador.ligar();
        amplificador.ajustarVolume(volume);
        player.ligar();
        player.playFilme(filme);
    }

    void finalizarRotina(){
        pipoqueira.desligar();
        luzes.ligar();
        telao.subir();
        projetor.desligar();
        amplificador.desligar();
        player.desligar();
        System.out.println("\nSessão finalizada.\n");
    }
}
