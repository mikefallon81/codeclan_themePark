package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ITicketed, ISecurity {

    private double price;

    public RollerCoaster(String name, int rating) {
        super(name, rating);
        this.price = 8.40;
    }

    public double defaultPrice(){
        return this.price;
    }

    public double priceFor(Visitor visitor){
        if (visitor.getHeight() > 2.00){
            return this.price * 2;
        } else {
            return this.price;
        }

    }

    @Override
    public boolean isAllowedToVisit(Visitor visitor){
        if (visitor.getHeight() >= 1.45 && visitor.getAge() >= 12){
            return true;
        }else
            return false;
     }


}
