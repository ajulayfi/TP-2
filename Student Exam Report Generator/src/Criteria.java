
public class Criteria {

	String text;
	int weight;

	public Criteria(String text, int weight) {
		setText(text);
		setWeight(weight);
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

}
