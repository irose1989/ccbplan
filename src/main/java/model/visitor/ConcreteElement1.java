package model.visitor;

/**
 *
 * 元素类：实现抽象元素类所声明的accept方法，通常都是visitor.visit(this)，基本上已经形成一种定式了。
 * Created by Administrator on 2015/10/12.
 */
public class ConcreteElement1 extends SubElement {
    @Override
    public void doSomethings() {
        System.out.println("ConcreteElement1 .......");
    }

    @Override
    public void accept(Ivisitor ivisitor) {
        ivisitor.visit(this);
    }
}
