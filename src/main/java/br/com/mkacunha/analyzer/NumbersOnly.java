package br.com.mkacunha.analyzer;

import br.com.mkacunha.model.Password;

public class NumbersOnly implements Analyzer {

	public int analyzer(Password password) {
		for (int i = 0; i < password.length(); i++) {
			if (!password.getCharacter(i).matches("[0-9]"))
				return 0;
		}

		return password.length() * -1;
	}

}
