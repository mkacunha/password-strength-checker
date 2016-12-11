package br.com.mkacunha.analyzer;

import br.com.mkacunha.model.Password;

public class ConsecutiveLowercaseLetters implements Analyzer {

	public int analyzer(Password password) {
		int count = 0;

		for (int i = 0; i < password.length(); i++) {
			if (i > 0) {
				String characterPrevious = password.getCharacter(i - 1);
				String characterCurrent = password.getCharacter(i);

				if (characterPrevious.matches("[a-z]") && characterCurrent.matches("[a-z]"))
					count++;
			}
		}

		if (count > 0)
			return count * -2;

		return 0;
	}
}
