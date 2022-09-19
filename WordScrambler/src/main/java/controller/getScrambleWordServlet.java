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

import model.scrambleWord;

/**
 * Servlet implementation class getScrambleWordServlet
 */
@WebServlet("/getScrambleWordServlet")
public class getScrambleWordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public getScrambleWordServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String scrambleWord = request.getParameter("scrambleWord");

		scrambleWord sw = new scrambleWord(scrambleWord);
		sw.activateScramble();

		request.setAttribute("scrambledWord", sw);
		getServletContext().getRequestDispatcher("/scrambleResult.jsp").forward(request, response);
		PrintWriter writer = response.getWriter();
		writer.println(sw.print());
		writer.close();
	}

}
