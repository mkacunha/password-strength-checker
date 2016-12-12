package br.com.mkacunha.analyzer;

import java.util.ArrayList;
import java.util.List;

import br.com.mkacunha.model.Password;

public class AnalyzerPassword {

	public final static String ALPHAS = "abcdefghijklmnopqrstuvwxyz";
	public final static String NUMERICS = "0123456789";
	public final static String SYMBOLS = ")!@#$%^&*()";
	public final static String SYMBOLS_REGEX = "[)!@#$%ˆ&*()]";

	private List<Analyzer> analyzers = new ArrayList<Analyzer>();

	public AnalyzerPassword() {
		initAnalyzers();
	}

	public void toAnalyze(Password password) {

		int score = 0;

		for (Analyzer analyzer : analyzers) {
			score += analyzer.analyzer(password);
		}

		password.setScore(score);
	}

	private void initAnalyzers() {
		analyzers.add(new NumberOfCharacters());
		analyzers.add(new UppercaseLetters());
		analyzers.add(new LowercaseLetters());
		analyzers.add(new Numbers());
		analyzers.add(new Symbols());
		analyzers.add(new MiddleNumbersOrSymbols());
		analyzers.add(new Requirements());
		analyzers.add(new LettersOnly());
		analyzers.add(new NumbersOnly());
		analyzers.add(new RepeatCharacters());
		analyzers.add(new ConsecutiveUppercaseLetters());
		analyzers.add(new ConsecutiveLowercaseLetters());
		analyzers.add(new ConsecutiveNumbers());
		analyzers.add(new SequentialLettersThree());
		analyzers.add(new SequentialNumbersThree());
		analyzers.add(new SequentialSymbolsThree());
	}
}
