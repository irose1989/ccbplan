package model.mediator.modify;

/**
 * Created by wb-chenchaobin on 2015/10/10.
 */
abstract class AbstractMediator {
    protected AbstractColleague a;
    protected AbstractColleague b;

    public AbstractMediator(AbstractColleague a, AbstractColleague b) {
        this.a = a;
        this.b = b;
    }

    public abstract void AEfectB();

    public abstract void BEfectA();

}
