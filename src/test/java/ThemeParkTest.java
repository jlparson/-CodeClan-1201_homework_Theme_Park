import attractions.*;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.CandyflossStall;
import stalls.IceCreamStall;
import stalls.ParkingSpot;
import stalls.TobaccoStall;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Dodgems dodgems;
    Park park;
    Playground playground;
    RollerCoaster rollerCoaster;
    CandyflossStall candyflossStall;
    IceCreamStall iceCreamStall;
    TobaccoStall tobaccoStall;
    Visitor visitor;

    @Before
    public void before(){
        themePark = new ThemePark();
        dodgems = new Dodgems("Bumper Cars", 2);
        park = new Park("Fun Park", 6);
        playground = new Playground("Play Time Playground", 4);
        rollerCoaster = new RollerCoaster("Colossus", 8);
        candyflossStall = new CandyflossStall("Sugar Sugar", "Jenny", ParkingSpot.A1, 7);
        iceCreamStall = new IceCreamStall("The Creamery", "Marion", ParkingSpot.A4, 10);
        tobaccoStall = new TobaccoStall("Bacco", "Karen", ParkingSpot.B1, 0);
        visitor = new Visitor(20, 165, 50.00);
    }

    @Test
    public void hasAttractions(){
        themePark.addAttraction(dodgems);
        themePark.addAttraction(park);
        themePark.addAttraction(playground);
        themePark.addAttraction(rollerCoaster);
        assertEquals(4, themePark.getAttractionsCount());
    }

    @Test
    public void hasStalls(){
        themePark.addStall(candyflossStall);
        themePark.addStall(iceCreamStall);
        themePark.addStall(tobaccoStall);
        assertEquals(3, themePark.getStallsCount());
    }

//    @Test
//    public void canGetAllReviewed(){
//        themePark.getAllReviewed();
//        assertEquals(7, themePark.getReviewedCount());
//    }

}
