package model.observer;

import org.junit.Test;

/**
 * Created by wb-chenchaobin on 2015/10/12.
 */
public class Client {
    @Test
    public void test1(){
        Subject subject = new CreateSubject();
        subject.addObserver(new SubObserver1());
        subject.addObserver(new SubObserver2());
        subject.doingSomething();
    }
}
