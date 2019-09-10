package attractions;

import behaviours.ITicketed;
import people.Visitor;


public class Dodgems extends Attraction implements ITicketed {

    private double price;

    public Dodgems(String name, int rating) {
        super(name, rating);
        this.price = 4.50;
    }

    public double defaultPrice() {
        return this.price;
    }

    public double priceFor(Visitor visitor) {
        if (visitor.getAge() < 12.00) {
            return this.price / 2;
        } else
            return this.price;

    }

}
