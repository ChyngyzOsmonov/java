package coffee.shop;

import coffee.base.Coffee;
import coffee.types.Americano;
import coffee.types.CaffeLatte;
import coffee.types.Cappuccino;
import coffee.types.Espresso;
import coffee.utils.CoffeeType;

public class CoffeeShop {
    public Coffee orderCoffee(CoffeeType type) {
        Coffee coffee = null;

        switch (type) {
            case ESPRESSO -> {
                coffee = new Espresso();
                break;
            }
            case AMERICANO -> {
                coffee = new Americano();
                break;
            }
            case CAPPUCCINO -> {
                coffee = new Cappuccino();
                break;
            }
            case CAFFE_LATTE -> {
                coffee = new CaffeLatte();
                break;
            }
        }

        coffee.grind();
        coffee.make();
        coffee.pour();

        return coffee;
    }
}
