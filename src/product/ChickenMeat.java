package product;

public class ChickenMeat implements product {
    private  String price;

    @Override
    public void sell() {
        System.out.println("卖鸡肉获得："+price+"元");
    }
}
