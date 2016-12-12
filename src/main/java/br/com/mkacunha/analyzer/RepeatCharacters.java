package br.com.mkacunha.analyzer;

import br.com.mkacunha.model.Password;

public class RepeatCharacters implements Analyzer {

	public int analyzer(Password password) {
		int nRepChar = 0;

		String pass = password.getPassword().replace(" ", "");
		int length = pass.length();
		double nRepInc = 0;
		double nUnqChar = 0;

		for (int a = 0; a < length; a++) {
			boolean bCharExists = false;
			for (int b = 0; b < length; b++) {

				String carA = pass.substring(a, a + 1);
				String carB = pass.substring(b, b + 1);

				if (carA.equals(carB) && a != b) {
					bCharExists = true;

					Double ld = Double.valueOf(length);
					Double ad = Double.valueOf(a);
					Double bd = Double.valueOf(b);

					nRepInc += Math.abs(ld / (bd - ad));
				}
			}
			if (bCharExists) {
				nRepChar++;
				nUnqChar = length - nRepChar;
				nRepInc = ((nUnqChar > 0) ? Math.ceil(nRepInc / nUnqChar) : Math.ceil(nRepInc));
			}
		}

		if (nRepChar > 0)
			return (int) (nRepInc * -1);

		return 0;
	}
}
