package br.com.mkacunha.analyzer;

import br.com.mkacunha.model.Password;

public class SequentialLettersThree implements Analyzer {

	public int analyzer(Password password) {
		int count = 0;

		for (int i = 0; i < 23; i++) {
			String sequence = AnalyzerPassword.ALPHAS.substring(i, i + 3).toUpperCase();
			String sequenceReverse = new StringBuilder(sequence).reverse().toString();

			if (password.getPassword().toUpperCase().contains(sequence)
					|| password.getPassword().toUpperCase().contains(sequenceReverse))
				count++;
		}

		if (count > 0)
			return count * -3;

		return 0;
	}
}
