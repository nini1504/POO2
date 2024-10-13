public class Carro {
    cintoSeguranca cinto = new cintoSeguranca();
    Farol farol = new Farol();
    Motor motor = new Motor();
    Porta porta = new Porta();
    Radio radio = new Radio();

    public void iniciarCorrida(double estacao){
        System.out.println("\nIniciando corrida...\n");
        motor.ligar();
        porta.trancar();
        cinto.travar();
        farol.acender();
        radio.ligar();
        radio.sintonizar(estacao);
        System.out.println("\n");
    }
    public void finalizarCorrida(){
        motor.desligar();
        porta.destrancar();
        cinto.destravar();
        farol.apagar();
        radio.desligar();
        System.out.println("\nCorrida finalizada.\n");

    }


}
