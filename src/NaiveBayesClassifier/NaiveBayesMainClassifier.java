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
	}
	
	
	
	public double getTutorProbability (List<Integer> booksBoughtByStudent) {
		return 0.0;
	}
    
	
}
