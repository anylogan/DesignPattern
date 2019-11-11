package observer;

import room.Field;

public class FieldUpdate  extends Observer{

    public FieldUpdate (Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
    	Field field=new Field();
    	for(int i=0;i<field.plants.size();i++)
    	{
    		field.plants.get(i).Growing();
    	}
        System.out.println( "the plants are growing up!" );
    }
}
