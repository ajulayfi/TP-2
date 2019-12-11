import java.util.ArrayList;

public class QuizResult {

	private Quiz quiz;
	private int quizScore;
	private ArrayList<String> answers;
	private Criteria criteria;

	public QuizResult(Quiz quiz) {
		setQuiz(quiz);
		criteria = new Criteria();
		answers = new ArrayList<String>();
	}

	public Quiz getQuiz() {
		return quiz;
	}

	public void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}

	public int getQuizScore() {
		return quizScore;
	}

	public void setQuizScore(int quizScore) {
		this.quizScore = quizScore;
	}

	public ArrayList<String> getAnswers() {
		return answers;
	}

	public void setAnswers(ArrayList<String> answers) {
		this.answers = answers;
	}

	public Criteria getCriteria() {
		return criteria;
	}

	public void setCriteria(Criteria criteria) {
		this.criteria = criteria;
	}

	public void takeAnswers() {

	}

	public void updateScore() {

	}
}
