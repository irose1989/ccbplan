package model.observer;

/**
 * Created by wb-chenchaobin on 2015/10/12.
 */
public class CreateSubject extends Subject {
    @Override
    public void doingSomething() {
        System.out.println("被观察者事件反生");
        notifyObserver();
    }
}
