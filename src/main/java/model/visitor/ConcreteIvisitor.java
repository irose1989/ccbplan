package model.visitor;

/**
 * �����ߣ�ʵ�ֳ���������������ķ�������Ӱ�쵽�����߷��ʵ�һ�����ø�ʲô��Ҫ��ʲô���顣
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
