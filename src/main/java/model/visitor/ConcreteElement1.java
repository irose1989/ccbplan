package model.visitor;

/**
 *
 * Ԫ���ࣺʵ�ֳ���Ԫ������������accept������ͨ������visitor.visit(this)���������Ѿ��γ�һ�ֶ�ʽ�ˡ�
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
