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
@WebServlet("/servlets/Question03Servlet")
public class Question03Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Question03Servlet() {
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
		String mail = request.getParameter("mail");
		String menu = request.getParameter("menu");
		String text = request.getParameter("opinion");
		response.setContentType("text/html;charset = UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<h3>ご予約ありがとうございます！</h3>");
		out.print("お名前：" + name  + "様<br>");
		String jpMenu = "ヘッドスパ";
		if(menu.equals("cut")) {
			jpMenu = "カット";
		}else if(menu.equals("color")) {
			jpMenu = "カット+カラー";
		}
		out.print("ご予約内容：" + jpMenu  + "<br>");
		out.print(mail + "へ確認メールを送信しました！<br>");
		out.print("<p >正解です！すばらしい！ 次の問題に進んでください！</p>");
	}

}
