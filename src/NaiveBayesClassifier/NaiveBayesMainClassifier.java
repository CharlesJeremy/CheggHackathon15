package NaiveBayesClassifier;

import java.util.List;

import ProjectWideResources.ClassifierConstants;
import Student.Student;



public class NaiveBayesMainClassifier implements ClassifierConstants{
	
	private List<Student> studentstrainingData;
	private int[][] currentFrequencyTable;

	public NaiveBayesMainClassifier(List<Student> trainingData){
		this.trainingData = trainingData;
		currentFrequencyTable = new int[2][NUMBER_OF_BOOK_COLUMNS * 2];
	}
	
	
	public void train(){
		 currentFrequencyTable = new  int[2][NUMBER_OF_BOOK_COLUMNS];
		 for(int i = 0; i < NUMBER_OF_STUDENT_ROWS; i ++){
			 for(int j = 0; j < NUMBER_OF_BOOK_COLUMNS; j ++){	 
		    	 if (trainingData[i][j] == 0){
		    		 if(trainingData[i][NUMBER_OF_BOOK_COLUMNS] == 0){
		    			 currentFrequencyTable[0][j * 2] ++;
		    		 }else{
		    			 currentFrequencyTable[0][(j * 2) + 1] ++;
		    		 }
				 }else{
					 currentFrequencyTable[1][j] ++;
					 if(trainingData[i][NUMBER_OF_BOOK_COLUMNS] == 0){
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
