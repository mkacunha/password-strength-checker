package br.com.mkacunha.analyzer;

import br.com.mkacunha.model.Password;

public class NumberOfCharacters implements Analyzer {

	public int analyzer(Password password) {
		return password.length() * 4;
	}

}
