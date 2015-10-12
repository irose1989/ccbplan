package model.observer;

import java.util.Vector;

/**
 * Created by wb-chenchaobin on 2015/10/12.
 */
public abstract class Subject {
    private Vector<Observer> vector = new Vector<Observer>();
    public void addObserver(Observer observer){
        this.vector.add(observer);
    }
    public void removeObserver(Observer observer){
        this.vector.remove(observer);
    }
    /**通知观察者*/
    public void notifyObserver(){
        for(Observer observer:vector){
            observer.update();
        }
    }
    public abstract void doingSomething();
}
