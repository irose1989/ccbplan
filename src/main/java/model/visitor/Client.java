package model.visitor;

import org.junit.Test;

import java.util.List;

/**
 * Created by Administrator on 2015/10/12.
 */
public class Client {
    @Test
    public void test1(){
        List<SubElement> list = ObjectStruture.getList();
        for(SubElement element:list){
            element.accept(new ConcreteIvisitor());
        }
    }
}
