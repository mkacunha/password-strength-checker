package br.com.mkacunha.model;

public class Password {

	private String password;
	private int score;
	private Complexity complexity;

	public Password(String password) {
		this.password = password;
	}

	public int length() {
		return password.length();
	}

	public String getCharacter(int index) {
		return password.substring(index, index + 1);
	}

	public boolean contains(CharSequence s) {
		return password.contains(s);
	}

	public void setScore(int score) {
		this.score = score;

		this.score = this.score > 100 ? 100 : this.score;
		this.score = this.score < 0 ? 0 : this.score;

		this.complexity = Complexity.of(score);
	}

	public String getPassword() {
		return password;
	}

	public int getScore() {
		return score;
	}

	public Complexity getComplexity() {
		return complexity;
	}
}
