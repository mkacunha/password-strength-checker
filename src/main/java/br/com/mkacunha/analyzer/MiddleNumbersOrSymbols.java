package br.com.mkacunha.analyzer;

import br.com.mkacunha.model.Password;

public class MiddleNumbersOrSymbols implements Analyzer {

	public int analyzer(Password password) {
		int nMidChar = 0;

		for (int i = 0; i < password.length(); i++) {

			String car = password.getCharacter(i);

			if (car.matches("[0-9]")) {
				if (i > 0 && i < (password.length() - 1)) {
					nMidChar++;
				}
			} else if (car.matches("[^a-zA-Z0-9_]")) {
				if (i > 0 && i < (password.length() - 1)) {
					nMidChar++;
				}
			}

		}

		if (nMidChar > 0)
			return nMidChar * 2;

		return 0;
	}
}
