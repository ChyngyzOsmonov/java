public class Order {
    private int amount;
    private int amountOfGoods;

    public Order(int amount, int amountOfGoods) {
        this.amount = amount;
        this.amountOfGoods = amountOfGoods;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmountOfGoods() {
        return amountOfGoods;
    }

    public void setAmountOfGoods(int amountOfGoods) {
        this.amountOfGoods = amountOfGoods;
    }
}
