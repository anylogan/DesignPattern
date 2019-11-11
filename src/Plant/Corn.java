package Plant;

public class Corn extends Plant{
    public Corn(){
        ps = null;
        Type = "Corn";
        GrowthValue = 0;
        LivingState = "Immature";
        HealthValue = 100;
    }

    public void Growing(){
        if (this.GrowthValue < 100 && this.HealthValue > 0) {
            this.GrowthValue += 10;
            this.HealthValue -= 5;
        }
        else if(this.GrowthValue >= 100) {
            System.out.print(this.GrowthValue);
            System.out.print(this.HealthValue);
            System.out.print("玉米成熟了!!!\n");
        }
        else if(this.HealthValue < 0){
            LivingState = "Death";
            System.out.print("玉米已死亡!!!\n");
        }
        SetPlantState(new Lack_N());
    }
    public void Harvested(){
        if(this.GrowthValue >= 100) {
            this.LivingState = "Mature";
            System.out.print("玉米丰收咯!!!\n");
        }
        else{
            System.out.print("别急，玉米还没熟呢!!!\n");
        }
    }
    public void Watering(){
        this.GrowthValue += 2;
        if (this.HealthValue < 90)
            this.HealthValue += 10;
        else
            this.HealthValue = 100;
        this.HealthValue += 10;
        System.out.print("玉米已浇水，成长值+2 & 健康值+10!!!\n");
        SetPlantState(new Lack_P());
    }
    public void Weeding(){
        this.GrowthValue += 2;
        if (this.HealthValue < 90)
            this.HealthValue += 10;
        else
            this.HealthValue = 100;
        System.out.print("玉米已除草，成长值+2 & 健康值+10!!!\n");
        SetPlantState(new Lack_K());
    }
    public void Check(){

    }
}
