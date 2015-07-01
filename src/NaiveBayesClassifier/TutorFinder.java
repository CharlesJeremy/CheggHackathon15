package NaiveBayesClassifier;

import java.util.ArrayList;
import java.util.List;

import ProjectWideResources.ClassifierConstants;
import Student.Student;
import Tutor.Tutor;

public class TutorFinder implements ClassifierConstants {
	private List<Student> allStudents;
	private List<Tutor> allTutors;
	
    private static final String TUTOR1 = "Charles";
    private static final String TUTOR2 = "Nicole";
    private static final String TUTOR3 = "John";
    private static final String TUTOR4 = "Deepak";
    private static final String TUTOR5 = "Nathaniel";
    private static final String TUTOR6 = "Gerrit";
    
	
	public TutorFinder(List<Student> allStudents){
		//statically instantiate tutor array here....
    	this.allStudents = allStudents;
    }
	
	public List<Tutor> getSortedTutorSuggestions(){
		return new ArrayList<Tutor>();
	}
}
