package model.visitor;

/**
 *
 * ����Ԫ���ࣺ�ӿڻ��߳����࣬����������һ������߷��ʣ���������ͨ��accept�����еĲ���������ġ�
 * ����Ԫ��һ�������෽����һ�����Ǳ����ҵ���߼�������������������������������ʡ�
 * Created by Administrator on 2015/10/12.
 */
public abstract class SubElement {
    public abstract void doSomethings();
    public abstract void accept(Ivisitor ivisitor);
}
