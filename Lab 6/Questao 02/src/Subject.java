import java.util.ArrayList;
import java.util.List;

public class Subject {
    List<Observer> oblist = new ArrayList<>();
    double precoA;
    public void addObserver(Observer invest) {
        oblist.add(invest);
    }
    public void notifyObservers(){
        for(Observer invest: oblist){
            invest.update(precoA);
        }
    }
    public double getPrecoA() {
        return precoA;
    }
    public void setPreco(double p) {
        System.out.println("Preço atual da ação: " + p);
        this.precoA = p;
        notifyObservers();
    }

}
