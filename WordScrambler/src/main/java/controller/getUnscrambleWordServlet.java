/**
 * @author Elijah Edlund - ezedlund
 * CIS175 - Fall 2021
 * Sep 18, 2022
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.unscrambleWord;

/**
 * Servlet implementation class getScrambleWordServlet
 */
@WebServlet("/getUnscrambleWordServlet")
public class getUnscrambleWordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public getUnscrambleWordServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String unscrambleWord = request.getParameter("unscrambleWord");

		unscrambleWord usw = new unscrambleWord(unscrambleWord);
		usw.activateUnscramble();

		request.setAttribute("unscrambledWord", usw);
		getServletContext().getRequestDispatcher("/unscrambleResult.jsp").forward(request, response);
		PrintWriter writer = response.getWriter();
		writer.println(usw.print());
		writer.close();
	}

}
