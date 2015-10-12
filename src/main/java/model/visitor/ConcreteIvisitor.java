package model.visitor;

/**
 * 访问者：实现抽象访问者所声明的方法，它影响到访问者访问到一个类后该干什么，要做什么事情。
 * Created by Administrator on 2015/10/12.
 */
public class ConcreteIvisitor implements Ivisitor {
    public void visit(ConcreteElement1 concreteElement1) {
        concreteElement1.doSomethings();
    }

    public void visit(ConcreteElement2 concreteElement2) {
        concreteElement2.doSomethings();
    }
}
