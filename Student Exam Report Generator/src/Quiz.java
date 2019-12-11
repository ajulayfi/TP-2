import java.util.ArrayList;

public class Quiz {

	private int id;
	private int numberOfProblems;
	private ArrayList<Problem> problems;

	public Quiz(int id, int numberOfProblems) {
		setId(id);
		setNumberOfProblems(numberOfProblems);
		problems = new ArrayList<Problem>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumberOfProblems() {
		return numberOfProblems;
	}

	public void setNumberOfProblems(int numberOfProblems) {
		this.numberOfProblems = numberOfProblems;
	}

	public ArrayList<Problem> getProblems() {
		return problems;
	}

	public void setProblems(ArrayList<Problem> problems) {
		this.problems = problems;
	}

}
