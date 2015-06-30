package NaiveBayesClassifier;

import java.util.List;

import ProjectWideResources.ClassifierConstants;



public class NaiveBayesMainClassifier implements ClassifierConstants{
	
	private int[][] trainingData;
	private int[][] currentFrequencyTable;

	public NaiveBayesMainClassifier(int[][] trainingData){
		this.trainingData = trainingData;
	}
	
	
	public void train(){
		 currentFrequencyTable = new  int[2][NUMBER_OF_BOOK_COLUMNS];
		 for(int i = 0; i < NUMBER_OF_STUDENT_ROWS; i ++){
			 for(int j = 0; j < NUMBER_OF_BOOK_COLUMNS; j ++){	 
		    	 if (trainingData[i][j] == 0){
					 currentFrequencyTable[0][j] ++;
				 }else{
					 currentFrequencyTable[1][j] ++;
				 }
			}	 
		}
		//Laplace adjust
		 for(int i = 0; i < 2; i ++){
			 for(int j = 0; j < NUMBER_OF_BOOK_COLUMNS; j ++){	 
				 currentFrequencyTable[i][j] ++;
			 }
		}
	}
	
	
	
	public double getTutorProbability (List<Integer> booksBoughtByStudent) {
		return 0.0;
	}
    
	
}
