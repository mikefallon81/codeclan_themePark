package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(20, 2.01, 40);
        visitor2 = new Visitor(10, 2.01, 40);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void hasPrice(){
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.01);
    }

    @Test
    public void canChargeDoubleForPeopleOver200cm(){
        assertEquals(16.80, rollerCoaster.priceFor(visitor1), 0.01);
    }

    @Test
    public void isVisitorAllowedTrue(){
        assertEquals(true, rollerCoaster.isAllowedToVisit(visitor1));
    }

    @Test
    public void isVisitorAllowedFalse(){
        assertEquals(false, rollerCoaster.isAllowedToVisit(visitor2));
    }

}
