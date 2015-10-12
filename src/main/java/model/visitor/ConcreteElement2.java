package model.visitor;

/**
 * Created by Administrator on 2015/10/12.
 */
public class ConcreteElement2 extends SubElement {
    @Override
    public void doSomethings() {
        System.out.println("ConcreteElement2 .......");
    }

    @Override
    public void accept(Ivisitor ivisitor) {
        ivisitor.visit(this);
    }
}
