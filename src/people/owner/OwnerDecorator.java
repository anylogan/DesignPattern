package people.owner;

import people.People;

//  装饰器模式 让主人干雇员的活
public abstract  class OwnerDecorator implements People {
   protected  People decoratorowner;
    public OwnerDecorator(People decoratedPeople){
        this.decoratorowner= decoratedPeople;
    }
    public void work(){
       decoratorowner.work();
    }

}
