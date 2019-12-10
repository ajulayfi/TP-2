import java.util.ArrayList;

public class Professor {

	private int professorID;
	private String name;
	private ArrayList<Class> classes;


	public Professor(int professorID, String name) {
		setProfessorID(professorID);
		setName(name);
		classes = new ArrayList<Class>();
	}

	public int getProfessorID() {
		return professorID;
	}

	public void setProfessorID(int professorID) {
		this.professorID = professorID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Class> getClasses() {
		return classes;
	}

	public void setClasses(ArrayList<Class> classes) {
		this.classes = classes;
	}

}
