package Student;


import ProjectWideResources.ClassifierConstants;


/**
 * Created by dsharma on 6/30/15.
 */
public class Student implements ClassifierConstants
{
    private String studentName;
    private int[] purchasedBooks; // contains 1's and 0's
    private int usedTutor;

    
    public Student (String studentName, int numberOfBooksBought){
    	purchasedBooks = new int[numberOfBooksBought];
    }
    
    public String getStudentName() {
    	return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }


    public int getPurchasedBook(int bookNumber) {
        return purchasedBooks[bookNumber];
    }
    
    public void setPurchasedBook(int bookNumber, int bookUsed) {
        this.purchasedBooks[bookNumber] =  bookUsed;
    }

    public void setUsedTutor(int usedTutor) {
        this.usedTutor =  usedTutor;
    }

    public int getUsedTutor() {
        return usedTutor;
    }


}
