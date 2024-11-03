import java.util.ArrayList;
import java.util.List;

public class Subject {
    List<Observer> obslist = new ArrayList<>();
    int temp;
    int umid;
    int vel;
    public void addObserver(Observer Obs) {
        obslist.add(Obs);
    }
    public void notifyObservers(){
        for(Observer Obs: obslist){
            Obs.update(temp, umid, vel);
        }
    }
    public void setTemp(int temp) {
        this.temp = temp;
        notifyObservers();
    }
    public void setUmid(int umid) {
        this.umid = umid;
        notifyObservers();
    }
    public void setVel(int vel) {
        this.vel = vel;
        notifyObservers();
    }
    public void setInfos(int temp, int umid, int vel){
        this.temp = temp;
        this.umid = umid;
        this.vel = vel;
        notifyObservers();
    }
}
