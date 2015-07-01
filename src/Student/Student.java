package Student;

import java.util.List;
import java.util.Set;

import ProjectWideResources.ClassifierConstants;
import Tutor.Tutor;

/**
 * Created by dsharma on 6/30/15.
 */
public class Student implements ClassifierConstants
{
    private String studentName;
    private int[] purchasedBooks; // contains 1's and 0's
    private int[] usedTutors; //contains 1's and 0's

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }


    public int[] getPurchasedBookIdsId() {
        return purchasedBooks;
    }

    public void setUsedTutor(int tutorNumber, int usedTutor) {
        usedTutors[tutorNumber] =  usedTutor ;
    }

    public int getUsedTutor(int tutorNumber) {
        return usedTutors[tutorNumber];
    }


}
