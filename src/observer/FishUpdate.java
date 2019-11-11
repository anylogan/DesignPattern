package observer;

import room.FishPond;

public class FishUpdate  extends Observer{

    public FishUpdate (Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update()
    {
    	FishPond fishPond=new FishPond();
    	for(int i=0;i<fishPond.animals.size();i++)
    	{
    		fishPond.animals.get(i).grow();
    	}
        System.out.println( "The fishes are growing up!" );
    }
}