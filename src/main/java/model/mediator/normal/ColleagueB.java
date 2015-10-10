package model.mediator.normal;

/**
 * Created by wb-chenchaobin on 2015/10/10.
 */
public class ColleagueB extends AbstractColleague {
    @Override
    public void setNum(int num, AbstractColleague colleague) {
        colleague.setNum(num/100);
    }
}
