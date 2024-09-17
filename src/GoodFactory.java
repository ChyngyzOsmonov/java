public class GoodFactory {
    public Good produceGood(Order order) {
        if (order.getAmountOfGoods() >+ 10) {
            return new WholesaleGood();
        } else {
            return new RetailGood();
        }
    }
}
