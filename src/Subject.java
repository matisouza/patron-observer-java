import java.util.ArrayList;

public abstract class Subject {
    protected ArrayList<Observer> observers;

    public Subject() {
        this.observers = new ArrayList<>();
    }

    public void addSofkiano(Observer observer){
        observers.add(observer);
    }

    public void removeSofkiano(Observer observer){
        observers.remove(observer);
    }

    public abstract void notifiy();

    public ArrayList<Observer> getObservers() {
        return observers;
    }


}
