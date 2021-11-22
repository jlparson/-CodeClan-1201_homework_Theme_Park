package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;
    Visitor visitor4;

    @Before
    public void setUp() {

        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(10, 125, 6.00);
        visitor2 = new Visitor(19, 155, 25.00);
        visitor3 = new Visitor(20, 140, 10.00);
        visitor4 = new Visitor(25, 210, 10.00);
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
    public void shouldCheckIsAllowedToTrue(){
        assertEquals(true, rollerCoaster.isAllowedTo(visitor2));
    }

    @Test
    public void shouldCheckIsAllowedToFalseAge(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitor1));
    }

    @Test
    public void shouldCheckIsAllowedToFalseHeight(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitor3)); }

    @Test
    public void shouldHaveDefaultPrice(){
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.00);
    }

    @Test
    public void shouldCheckPriceForTallPeopleDoublePrice(){
        assertEquals(16.80, rollerCoaster.priceFor(visitor4), 0.00);
    }

}
