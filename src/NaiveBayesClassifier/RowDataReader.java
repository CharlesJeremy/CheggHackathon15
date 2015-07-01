package NaiveBayesClassifier;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ProjectWideResources.ClassifierConstants;
import Student.Student;

public class RowDataReader implements ClassifierConstants{
	private List<Student> allStudents;
	
	public RowDataReader() {
		allStudents = new ArrayList<Student>();
	}
	
	public List<Student> getData(String filename) {
		try {
			BufferedReader rd = new BufferedReader(new FileReader(filename));
			int nStudents = Integer.parseInt(rd.readLine());
			int nBooks = Integer.parseInt(rd.readLine()) - 1;
			for (int i = 0; i < nStudents; i++) {
				String line = rd.readLine();
				String studentName = "";
				for (int j = 0; j < STUDENT_NAME_LENGTH; j++) {
					studentName += line.charAt(i);
				}
				Student instance = new Student(studentName, nBooks);
				instance.setStudentName(studentName);
				line = line.substring(STUDENT_NAME_LENGTH);
				for (int j = 0; j < nBooks; j++) {
					instance.setPurchasedBook(j, Integer.parseInt(line.charAt(i) + ""));
				}
				instance.setUsedTutor(Integer.parseInt(line.charAt(nBooks) + ""));
				allStudents.add(instance);
			}
			rd.close();
			return allStudents;
		} catch (IOException ex) {
			return null;
		}
	}
}
