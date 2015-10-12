package model.visitor;

/**
 * 抽象访问者：抽象类或者接口，声明访问者可以访问哪些元素，具体到程序中就是visit方法中的参数定义哪些对象是可以被访问的。
 * Created by Administrator on 2015/10/12.
 */
public interface Ivisitor {
    public void visit(ConcreteElement1 concreteElement1);
    public void visit(ConcreteElement2 concreteElement2);
}
