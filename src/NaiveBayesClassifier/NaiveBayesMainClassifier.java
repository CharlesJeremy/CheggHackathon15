package NaiveBayesClassifier;

import java.util.List;

import ProjectWideResources.ClassifierConstants;
import Student.Student;



public class NaiveBayesMainClassifier implements ClassifierConstants{
	
	private List<Student> studentsTrainingData;
	private int[][] currentFrequencyTable;

	public NaiveBayesMainClassifier(List<Student> studentstTrainingData){
		this.studentsTrainingData =  studentstTrainingData;;
		currentFrequencyTable = new int[2][NUMBER_OF_BOOK_COLUMNS * 2];
	}
	
	
	public void train(){
		 currentFrequencyTable = new  int[2][NUMBER_OF_BOOK_COLUMNS];
		 for(int i = 0; i < NUMBER_OF_STUDENT_ROWS; i ++){
			 for(int j = 0; j < NUMBER_OF_BOOK_COLUMNS; j ++){	
				 Student studentObject = studentsTrainingData.get(i);
		    	 if (studentObject.getPurchasedBook(j) == 0){
		    		 if(studentObject.getUsedTutor() == 0){
		    			 currentFrequencyTable[0][j * 2] ++;
		    		 }else{
		    			 currentFrequencyTable[0][(j * 2) + 1] ++;
		    		 }
				 }else{
					 if(studentObject.getUsedTutor() == 0){
		    			 currentFrequencyTable[1][j * 2] ++;
		    		 }else{
		    			 currentFrequencyTable[1][(j * 2) + 1] ++;
		    		 }
				 }
			}	 
		}
		 
		//Laplace adjust
		 for(int i = 0; i < 2; i ++){
			 for(int j = 0; j < NUMBER_OF_BOOK_COLUMNS * 2; j ++){	 
				 currentFrequencyTable[i][j] ++;
			 }
		 }
	}
	
	
	
	public double getTutorProbability (Student  willStudentuseTutor) {
		return 0.0;
	}
    
	
}
