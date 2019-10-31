package product;

public class FishMeat implements product{
    private  String price;

    @Override
    public void sell() {
        System.out.println("卖鱼肉获得："+price+"元");
    }
}
