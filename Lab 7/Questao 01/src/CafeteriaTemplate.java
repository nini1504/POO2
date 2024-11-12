abstract class CafeteriaTemplate {

    abstract void preparaBebida();
    abstract void adicionaCondimentos();

    private void aqueceAgua() {
        System.out.println("Água aquecida");
    }
    private void poeNaXicara() {
        System.out.println("Bebida na xícara");
    }

    public void preparaReceita(Object o){
        System.out.println("\nPreparando " + o.getClass().getName());
        aqueceAgua();
        preparaBebida();
        poeNaXicara();
        adicionaCondimentos();
        System.out.println(o.getClass().getName()+" pronto.");
    }

}
