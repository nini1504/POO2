public class Main {
    public static void main(String[] args) {
        Subject cet = new CET();
        Observer p = new prefeitura();
        Observer a = new aeroporto();

        cet.addObserver(p);
        cet.addObserver(a);

        cet.setInfos(29, 47, 16);
        cet.setInfos(35, 71, 12);
    }
}

