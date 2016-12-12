package br.com.mkacunha.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import br.com.mkacunha.analyzer.AnalyzerPassword;
import br.com.mkacunha.model.Password;

@WebServlet(urlPatterns = "/analyzerpassword")
public class AnalyzerPasswordServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("application/json;charset=UTF-8");

		String senha = req.getParameter("password");
		Password password = null;
		if (senha != null && !senha.isEmpty()) {
			password = new Password(senha);
			new AnalyzerPassword().toAnalyze(password);
		} else {
			password = new Password("");
			password.setScore(0);
		}

		resp.getWriter().write(new Gson().toJson(password));
	}
}
