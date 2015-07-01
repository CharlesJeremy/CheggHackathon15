package NaiveBayesClassifier;

import java.util.ArrayList;
import java.util.List;

import ProjectWideResources.ClassifierConstants;
import Student.Student;
import Tutor.Tutor;

public class TutorFinder implements ClassifierConstants {
	private List<Tutor> allTutors;
	private NaiveBayesMainClassifier tutorClassifier;
	
    private static final String TUTOR1 = "Charles";
    private static final String TUTOR2 = "Nicole";
    private static final String TUTOR3 = "John";
    private static final String TUTOR4 = "Deepak";
    private static final String TUTOR5 = "Nathaniel";
    private static final String TUTOR6 = "Gerrit";
    
	
	public TutorFinder(List<Student> allStudents){
		tutorClassifier = new NaiveBayesMainClassifier(allStudents);
		tutorClassifier.train();
		//statically instantiate tutor array here....
    	//this.allStudents = allStudents;
    }
	

	
	private List<Tutor> getSortedSuggestions(Student testStudent){
		ArrayList<Tutor> sortedTutors = new ArrayList<Tutor>();
		for (int i = 0; i < 6; i++){ //adjust this to be a constatnt
			Double thisTutorProbability = tutorClassifier.getTutorProbability(testStudent);
			allTutors.get(i).setProbability(thisTutorProbability);
		}
        
		return sortedTutors;
	}

	

}
