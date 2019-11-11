package observer;

import room.ChickenCoop;

public class ChickenUpdate extends Observer{

    public ChickenUpdate(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override

    public void update()
    {
    	ChickenCoop chickenCoop=new ChickenCoop();
    	for(int i=0;i<chickenCoop.animals.size();i++)
    	{
    		chickenCoop.animals.get(i).grow();
    	}
        System.out.println( "The chicken are growing up!" );
    }
}
