package NaiveBayesClassifier;

import java.util.List;

import ProjectWideResources.ClassifierConstants;
import Student.Student;



public class NaiveBayesMainClassifier implements ClassifierConstants{
	
	private List<Student> studentsTrainingData;
	private int[][] currentFrequencyTable;
	private double  probabilityUsedTutorDenominator;
	private double  probabilityUsedNumerator;

	public NaiveBayesMainClassifier(List<Student> studentstTrainingData){
		this.studentsTrainingData =  studentstTrainingData;;
		currentFrequencyTable = new int[2][NUMBER_OF_BOOK_COLUMNS * 2];
		probabilityUsedTutorDenominator = 0;
		probabilityUsedNumerator = 0;
	}
	
	
	public void train(){
		 currentFrequencyTable = new  int[2][NUMBER_OF_BOOK_COLUMNS];
		 for(int i = 0; i < NUMBER_OF_STUDENT_ROWS; i ++){
			 Student studentObject = studentsTrainingData.get(i);
			 probabilityUsedTutorDenominator ++;
			 if(studentObject.getUsedTutor() == 1){
				 probabilityUsedNumerator ++;	
			 }
			 for(int j = 0; j < NUMBER_OF_BOOK_COLUMNS; j ++){	
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
		double probabilityWill =  probabilityUsedNumerator / probabilityUsedTutorDenominator;
		//double probabilityWont =  (probabilityUsedTutorDenominator - probabilityUsedNumerator) / probabilityUsedTutorDenominator;
		
		for(int i = 0; i < NUMBER_OF_BOOK_COLUMNS; i ++){
			double probabilityGivenBookNumerator = currentFrequencyTable[1][i * 2];
			double probabilityGivenBookDenominator =  currentFrequencyTable[1][i * 2] + currentFrequencyTable[1][(i * 2) + 1];
			probabilityWill *= (probabilityGivenBookNumerator / probabilityGivenBookDenominator);
			
			/*double probabilityGivenNotBookNumerator = currentFrequencyTable[0][i * 2];
			double probabilityGivenNotBookDenominator =  currentFrequencyTable[0][i * 2] + currentFrequencyTable[0][(i * 2) + 1];
			probabilityWont *= (probabilityGivenNotBookNumerator / probabilityGivenNotBookDenominator);*/
		}		
		return probabilityWill;
	}
    
	
}
