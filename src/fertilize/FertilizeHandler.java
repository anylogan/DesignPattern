package fertilize;

public abstract class FertilizeHandler {
	
	protected FertilizeHandler successor = null;
    /**
    	取值方法
     */
    public FertilizeHandler getSuccessor() {
        return successor;
    }
    /**
     	* 设置下一个处理请求的对象
     */
    public void setSuccessor(FertilizeHandler successor) {
        this.successor = successor;
    }
    /**
     	* 处理聚餐费用的申请
     * @param  fertilizer   肥料
     * @return        成功或失败的具体通知
     */
    public abstract String handleRequest(String fertilizer);
}
