import java.util.List;

/**
 * Created by dsharma on 6/30/15.
 */
public class Student implements ClassifierConstants
{
    private String name;
    private String studentId;
    private List<String> bookId;
    private List<Tutor> tutors;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public List<String> getBookId() {
        return bookId;
    }

    public void setBookId(List<String> bookId) {
        this.bookId = bookId;
    }

    public List<Tutor> getTutors() {
        return tutors;
    }

    public void setTutors(List<Tutor> tutors) {
        this.tutors = tutors;
    }
}
