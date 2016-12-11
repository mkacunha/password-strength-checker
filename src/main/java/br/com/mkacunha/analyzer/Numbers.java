package br.com.mkacunha.analyzer;

import br.com.mkacunha.model.Password;

public class Numbers implements Analyzer {

	public int analyzer(Password password) {
		if (new NumbersOnly().analyzer(password) < 0)
			return 0;

		int count = 0;

		for (int i = 0; i < password.length(); i++) {
			if (password.getCharacter(i).matches("[0-9]"))
				count++;
		}

		if (count > 0)
			return count * 4;

		return 0;
	}
}
