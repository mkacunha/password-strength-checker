package br.com.mkacunha.model;

public class PasswordScore {

	private int score;
	private Complexity complexity;

	public PasswordScore(int score) {
		this.score = score;

		if (this.score > 100)
			this.score = 100;

		if (this.score < 0)
			this.score = 0;

		if (this.score >= 0 && this.score < 20)
			this.complexity = Complexity.VERY_WEAK;
		else if (this.score >= 20 && this.score < 40)
			this.complexity = Complexity.WEAK;
		else if (this.score >= 40 && this.score < 60)
			this.complexity = Complexity.GOOD;
		else if (this.score >= 60 && this.score < 80)
			this.complexity = Complexity.STRONG;
		else if (this.score >= 80 && this.score <= 100)
			this.complexity = Complexity.VERY_STRONG;
	}

	public int getScore() {
		return score;
	}

	public Complexity getComplexity() {
		return complexity;
	}

	@Override
	public String toString() {
		return this.score + " - " + this.complexity;
	}

}
