package br.com.mkacunha.analyzer;

import java.util.regex.Pattern;

import br.com.mkacunha.model.Password;

public class Requirements implements Analyzer {

	public int analyzer(Password password) {
		int count = 0;

		if (password.length() >= 8) {
			count++;

			if (Pattern.compile("[A-Z]").matcher(password.getPassword()).find())
				count++;

			if (Pattern.compile("[a-z]").matcher(password.getPassword()).find())
				count++;

			if (Pattern.compile("[0-9]").matcher(password.getPassword()).find())
				count++;

			if (Pattern.compile(AnalyzerPassword.SYMBOLS_REGEX).matcher(password.getPassword()).find())
				count++;

			if (count >= 4)
				return count * 2;
		}

		return 0;
	}

}
