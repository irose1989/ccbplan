package model.mediator.modify;

/**
 * Created by wb-chenchaobin on 2015/10/10.
 */
abstract  class AbstractColleague {
    private  int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public abstract void setNum(int num,Mediator  mediator);
}
