public class Problem {

	private String question;
	private String answer;
	private int score;


	public Problem(String question, String answer, int score) {
		setQuestion(question);
		setAnswer(answer);
		setScore(score);
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
