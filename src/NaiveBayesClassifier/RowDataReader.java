package NaiveBayesClassifier;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class RowDataReader {
	
	public RowDataReader() {
		
	}
	
	public int[][] getData(String filename) {
		try {
			BufferedReader rd = new BufferedReader(new FileReader(filename));
			return null;
		} catch (IOException ex) {
			return null;
		}
	}
}
