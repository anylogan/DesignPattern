package product;

import java.util.ArrayList;

public class Order {
    private ArrayList<product> order;  //订单
    public void sell()
    {
        System.out.println("订单提交");
        //将订单卖出去   钱加上  仓库里东西减少
    }
    public void Return()
    {
        System.out.println("订单退回");

        //计算钱
        //money加上去
        //仓库里把货物放进去
    }

}