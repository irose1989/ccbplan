package model.visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 结构对象：一个元素的容器，一般包含一个容纳多个不同类、不同接口的容器，
 * 如List、Set、Map等，在项目中一般很少抽象出这个角色。
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
