<<<<<<< HEAD
=======
package Tutor;

>>>>>>> dc8bdfd3dbc7afb9517591de5a30b0be87882d97
import ProjectWideResources.ClassifierConstants;

/**
 * Created by dsharma on 6/30/15.
 */
public class Tutor implements ClassifierConstants {

    private String name;
    private String schoolName;
    private String picture;
    private int positiveReviews;
    private int negativeReviews;

    public Tutor() {
    	
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String emailId) {
        this.schoolName = emailId;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public int getPositiveReviews() {
        return positiveReviews;
    }

    public void setPositiveReviews(int positiveReviews) {
        this.positiveReviews = positiveReviews;
    }

    public int getNegativeReviews() {
        return negativeReviews;
    }

    public void setNegativeReviews(int negativeReviews) {
        this.negativeReviews = negativeReviews;
    }
}
