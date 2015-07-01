package NaiveBayesClassifier;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import ProjectWideResources.ClassifierConstants;

public class RowDataReader implements ClassifierConstants{
	
	public RowDataReader() {
		
	}
	
	public int[][] getData(String filename) {
		int[][] data = new int[NUMBER_OF_STUDENT_ROWS][NUMBER_OF_BOOK_COLUMNS + 1];
		try {
			BufferedReader rd = new BufferedReader(new FileReader(filename));
			for (int rowIndex = 0; rowIndex < NUMBER_OF_STUDENT_ROWS; rowIndex++) {
				String[] input = rd.readLine().split("[ ]+");
				for (int columnIndex = 0; columnIndex < NUMBER_OF_BOOK_COLUMNS + 1; columnIndex++) {
					data[rowIndex][columnIndex] = Integer.parseInt(input[columnIndex]);
				}
			}
			rd.close();
			return data;
		} catch (IOException ex) {
			return null;
		}
	}
}
