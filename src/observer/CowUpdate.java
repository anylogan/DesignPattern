package observer;

import room.CowShed;

public class CowUpdate extends Observer{

    public CowUpdate(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override

    public void update()
    {
    	CowShed cowShed=new CowShed();
    	for(int i=0;i<cowShed.animals.size();i++)
    	{
    		cowShed.animals.get(i).grow();
    	}
        System.out.println( "The cows are growing up!" );
    }
}
