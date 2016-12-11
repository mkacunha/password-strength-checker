package br.com.mkacunha.analyzer;

import br.com.mkacunha.model.Password;

public class Symbols implements Analyzer {

	public int analyzer(Password password) {
		int count = 0;
		for (int i = 0; i < password.length(); i++) {
			if (password.getCharacter(i).matches("[^a-zA-Z0-9_]"))
				count++;
		}

		if (count > 0)
			return count * 6;

		return 0;
	}
}
