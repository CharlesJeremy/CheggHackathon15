package Tutor;

import ProjectWideResources.ClassifierConstants;

/**
 * Created by dsharma on 6/30/15.
 */
public class Tutor implements ClassifierConstants {

    private String name;
    private String schoolName;
    private String picture;
    private int positiveReviews;
    private double probability;
    //private int negativeReviews;

    public Tutor() {

    }

    public double getProbability(){
      return probability;
    }

    public void setProbability(double probability){
      this.probability = probability;
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
    
   
    
    @Override
    public boolean equals(Object obj){
    	return this.getProbability() == ((Tutor) obj).getProbability();
    }
    
   
}
