import attractions.Attraction;
import attractions.Dodgems;
import behaviours.IReviewed;
import stalls.CandyflossStall;
import stalls.Stall;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;
    private ArrayList<IReviewed> reviewedObjects;

    public ThemePark(){
        this.attractions = new ArrayList<>();
        this.stalls = new ArrayList<>();
        this.reviewedObjects = new ArrayList<>();
    }


    public void addAttraction(Attraction attraction) {
        this.attractions.add(attraction);
    }

    public int getAttractionsCount() {
        return attractions.size();
    }

    public void addStall(Stall stall) {
        this.stalls.add(stall);
    }

    public int getStallsCount() {
        return stalls.size();
    }

//    public int getReviewedCount() {
//        return reviewedObjects.size();
//    }
//
//    public ArrayList<IReviewed> getAllReviewed() {
//        return reviewedObjects;
//    }
//
//    public ArrayList<Attraction> getAllAttractions(){
//        return attractions;
//    }
//
//    public ArrayList<Stall> getAllStalls(){
//        return stalls;
//    }
}
