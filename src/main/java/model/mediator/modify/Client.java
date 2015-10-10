package model.mediator.modify;

import org.junit.Test;

/**
 * Created by wb-chenchaobin on 2015/10/10.
 */
public class Client  {
    @Test
    public void test1(){
        AbstractColleague A = new ColleagueA();
        AbstractColleague B = new ColleagueB();
        AbstractMediator mediator = new Mediator(A,B);
        A.setNum(100);
        System.out.println("====a印象b===");
        mediator.AEfectB();
        System.out.println("a:" + A.getNum() + " b:" + B.getNum());

        B.setNum(100);
        System.out.println("====b印象a===");
        mediator.BEfectA();
        System.out.println("a:" + A.getNum() + " b:" + B.getNum());
    }
}
