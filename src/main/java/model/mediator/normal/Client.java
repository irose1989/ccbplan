package model.mediator.normal;

import org.junit.Test;

/**
 * Created by wb-chenchaobin on 2015/10/10.
 */
public class Client {
    @Test
    public void test1(){
        AbstractColleague a = new ColleagueA();
        AbstractColleague b = new ColleagueB();
        System.out.println("====a印象b===");
        a.setNum(100);
        a.setNum(100, b);
        System.out.println("a:"+a.getNum() +" b:"+ b.getNum());
        System.out.println("====b印象a===");
        b.setNum(100);
        b.setNum(100, a);
        System.out.println("a:"+a.getNum() +" b:"+ b.getNum());
    }

}
