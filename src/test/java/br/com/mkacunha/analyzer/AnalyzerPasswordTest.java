package br.com.mkacunha.analyzer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.mkacunha.model.Password;

public class AnalyzerPasswordTest {

	AnalyzerPassword analyzerPassword = new AnalyzerPassword();

	private int analyzePassword(String senha) {
		Password password = new Password(senha);
		analyzerPassword.toAnalyze(password);
		return password.getScore();
	}

	@Test
	public void apenasNumerosAleatorios() {
		assertEquals(23, analyzePassword("094776276"));
	}

	@Test
	public void letrasMaiusculasMinusculasAleatorias() {
		assertEquals(58, analyzePassword("oLkifhIuasbNhgd"));
	}

	@Test
	public void apenasLetrasMaiusculasAleatorias() {
		assertEquals(18, analyzePassword("AKDJFOIRUFHDNVBGR"));
	}

	@Test
	public void apenasLetrasMinusculasAleatorias() {
		assertEquals(18, analyzePassword("dmhkjotuhsslkfjsmsi"));
	}

	@Test
	public void numerosLetrasAleatorios() {
		assertEquals(80, analyzePassword("09JhHf64"));
	}

	@Test
	public void apenasCaracteresEspeciaisAleatorios() {
		assertEquals(87, analyzePassword("(*&@#$%_."));
	}

	@Test
	public void numerosLetrasCaracteresEspeciaisAleatorios() {
		assertEquals(94, analyzePassword("09*iIud)A"));
	}

	@Test
	public void letrasSequenciais() {
		assertEquals(16, analyzePassword("abCDefGhij"));
	}

	@Test
	public void numerosSequenciais() {
		assertEquals(21, analyzePassword("123987456765"));
	}

	@Test
	public void caracteresEspeciaisSequenciais() {
		assertEquals(59, analyzePassword("!@#$%ˆ"));
	}

	@Test
	public void letrasNumerosCaracteresEspeciaisSequenciais() {
		assertEquals(79, analyzePassword("abc789!@#"));
	}

	@Test
	public void senhaContendoUnderline() {
		assertEquals(29, analyzePassword("12345_"));
	}

	@Test
	public void senhaContendoEspaco() {
		assertEquals(12, analyzePassword("koiuy o"));
	}

	@Test
	public void senhasAleatorias() {
		assertEquals(0, analyzePassword("99"));
		assertEquals(100, analyzePassword("-//..-09_098"));
		assertEquals(6, analyzePassword("kfju"));
		assertEquals(17, analyzePassword("..........."));
		assertEquals(38, analyzePassword("0o(8"));
		assertEquals(0, analyzePassword("aaasssddd"));
		assertEquals(4, analyzePassword("9876543210"));
		assertEquals(33, analyzePassword(">><<"));
		assertEquals(18, analyzePassword("opIIuuu"));
		assertEquals(77, analyzePassword("43RE43re"));
		assertEquals(36, analyzePassword("123abccba"));
		assertEquals(39, analyzePassword("123mudar"));
		assertEquals(53, analyzePassword(")(*&ˆ"));
		assertEquals(16, analyzePassword("uYuYuYuY"));
		assertEquals(8, analyzePassword("*****************"));
		assertEquals(69, analyzePassword("o)9faaa(8"));
		assertEquals(83, analyzePassword("!@#)(*u"));
		assertEquals(31, analyzePassword("erfzzzCCss"));
		assertEquals(0, analyzePassword("AAAAAAAAAA"));
		assertEquals(0, analyzePassword("aaaaaaaa"));
		assertEquals(71, analyzePassword("123098qwepoi"));
		assertEquals(59, analyzePassword("''''[]"));
		assertEquals(86, analyzePassword("[]{}[]{}"));
		assertEquals(44, analyzePassword("˜`:;"));
		assertEquals(12, analyzePassword("maikoouuu_"));
		assertEquals(5, analyzePassword("ko o"));
	}
}
