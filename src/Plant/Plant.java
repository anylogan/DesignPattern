package Plant;

public abstract class Plant implements Cloneable{
    public String Type;
    public int GrowthValue;
    public String LivingState;
    public int HealthValue;
    public PlantState ps;

    public abstract void Growing();
    public abstract void Harvested();
    public abstract void Watering();
    public abstract void Weeding();
    public abstract void Check();
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public void Fertilization() {
        ps.Fertilization(this);
    }
    public void SetPlantState(PlantState newps){
        ps = newps;
    }
}
