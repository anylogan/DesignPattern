package Plant;

public class Grass extends Plant{
    public Grass(){
        ps = null;
        Type = "Grass";
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
            System.out.print("牧草成熟了!!!\n");
        }
        else if(this.HealthValue < 0){
            LivingState = "Death";
            System.out.print("牧草已死亡!!!\n");
        }
        SetPlantState(new Lack_N());
    }
    public void Harvested(){
        if(this.GrowthValue >= 100) {
            this.LivingState = "Mature";
            System.out.print("牧草丰收咯!!!\n");
        }
        else{
            System.out.print("别急，牧草还没熟呢!!!\n");
        }
    }
    public void Watering(){
        this.GrowthValue += 2;
        if (this.HealthValue < 90)
            this.HealthValue += 10;
        else
            this.HealthValue = 100;
        this.HealthValue += 10;
        System.out.print("牧草已浇水，成长值+2 & 健康值+10!!!\n");
        SetPlantState(new Lack_P());
    }
    public void Weeding(){
        this.GrowthValue += 2;
        if (this.HealthValue < 90)
            this.HealthValue += 10;
        else
            this.HealthValue = 100;
        System.out.print("牧草已除草，成长值+2 & 健康值+10!!!\n");
        SetPlantState(new Lack_K());
    }
    public void Check(){

    }
}
