package model.visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * �ṹ����һ��Ԫ�ص�������һ�����һ�����ɶ����ͬ�ࡢ��ͬ�ӿڵ�������
 * ��List��Set��Map�ȣ�����Ŀ��һ����ٳ���������ɫ��
 * Created by Administrator on 2015/10/12.
 */
public class ObjectStruture {
    private static  List list = new ArrayList();
    public static List<SubElement> getList(){
        Random random = new Random();
        for(int i = 0 ;i<20;i++){
            int code = random.nextInt(100);
            if(code>50){
                list.add(new ConcreteElement1());
            }else {
                list.add(new ConcreteElement2());
            }
        }
        return list;
    }
}
