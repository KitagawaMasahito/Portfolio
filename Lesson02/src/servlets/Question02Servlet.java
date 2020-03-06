package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Question01Servlet
 */
@WebServlet("/servlets/Question02Servlet")
public class Question02Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Question02Servlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset = UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<p> 送信の方法が異なっています！ getで送信しています～！ </p>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		response.setContentType("text/html;charset = UTF-8");
		PrintWriter out = response.getWriter();
		out.print("こんにちは" + name  + "さん。<br>");
		String jpGender = "男性";
		if(gender.equals("woman")) {
			jpGender = "女性";
		}
		out.print("あなたは"+jpGender+"ですね <br>");
		out.print("<p>正解です！すばらしい！ 次の問題に進んでください！</p>");
	}

}
