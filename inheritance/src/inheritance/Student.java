package inheritance;

public class Student extends Citizen {
    private String Stream;
    private String Grade;
	public String getStream() {
		return Stream;
	}
	public void setStream(String stream) {
		Stream = stream;
	}
	public String getGrade() {
		return Grade;
	}
	public void setGrade(String grade) {
		Grade = grade;
	}
	@Override
	public String toString() {
		return "Student [Stream=" + Stream + ", Grade=" + Grade + "]";
	}
    
}
