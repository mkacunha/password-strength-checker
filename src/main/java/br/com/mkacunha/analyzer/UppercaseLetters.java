package br.com.mkacunha.analyzer;

import br.com.mkacunha.model.Password;

public class UppercaseLetters implements Analyzer {

	public int analyzer(Password password) {
		int count = 0;
		boolean isUpperCaseLettersOnly = true;

		for (int i = 0; i < password.length(); i++) {
			if (password.getCharacter(i).matches("[A-Z]"))
				count++;
			else
				isUpperCaseLettersOnly = false;
		}

		if (count > 0 && !isUpperCaseLettersOnly)
			return (password.length() - count) * 2;

		return 0;
	}
}
