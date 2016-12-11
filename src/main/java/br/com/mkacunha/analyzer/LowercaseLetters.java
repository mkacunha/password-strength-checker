package br.com.mkacunha.analyzer;

import br.com.mkacunha.model.Password;

public class LowercaseLetters implements Analyzer {

	public int analyzer(Password password) {
		int count = 0;
		boolean isLowerCaseLettersOnly = true;
		for (int i = 0; i < password.length(); i++) {
			if (password.getCharacter(i).matches("[a-z]"))
				count++;
			else
				isLowerCaseLettersOnly = false;
		}

		if (count > 0 && !isLowerCaseLettersOnly)
			return (password.length() - count) * 2;

		return 0;
	}

}
