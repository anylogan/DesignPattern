package product;

public class OxMeat implements product{
    private  String price;

    @Override
    public void sell() {
        System.out.println("卖牛肉获得："+price+"元");
    }
}
