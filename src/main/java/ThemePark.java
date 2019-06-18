import Interfaces.IReviewed;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<IReviewed> reviews;

    public ThemePark(){
        this.reviews = new ArrayList<IReviewed>();

    }

    public void addReview(IReviewed iReviewed){
        this.reviews.add(iReviewed);
    }

    public ArrayList getAllReviewed(){
        return this.reviews;
    }
}
