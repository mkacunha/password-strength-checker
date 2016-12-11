package br.com.mkacunha.model;

public enum Complexity {

	VERY_WEAK, WEAK, GOOD, STRONG, VERY_STRONG;

	public static Complexity of(int score) {
		if (score < 20)
			return VERY_WEAK;
		else if (score >= 20 && score < 40)
			return WEAK;
		else if (score >= 40 && score < 60)
			return GOOD;
		else if (score >= 60 && score < 80)
			return STRONG;
		else if (score >= 80)
			return VERY_STRONG;
		return null;
	}
}
