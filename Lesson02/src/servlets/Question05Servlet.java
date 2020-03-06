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
@WebServlet("/servlets/Question05Servlet")
public class Question05Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Question05Servlet() {
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
		String gend = request.getParameter("gender");
		String jpGend = gend.equals("man") ? "男性" : "女性";
		String place = request.getParameter("place");
		String jpPlace = "";
		switch (place) {
		case "hokkaido":
			jpPlace = "北海道地区";
			break;
		case "touhoku":
			jpPlace = "東北地区";
			break;
		case "kantou":
			jpPlace = "関東地区";
			break;
		case "kansai":
			jpPlace = "関西地区";
			break;
		case "kyushu":
			jpPlace = "九州地区";
			break;
		}
		String sports[] = request.getParameterValues("sports");

		response.setContentType("text/html;charset = UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<h3>アンケートを受け付けました！</h3>");
		out.print("名　　前：" + name + " <br>");
		out.print("性　　別：" + jpGend + " <br>");
		out.print("お住まい：" + jpPlace + " <br>");
		out.print("興味のあるスポーツ："  + " <br>");
		for(int i = 0 ; i < sports.length;i++) {
			String jpSports = "";
			switch(sports[i]) {
			case "jog":
				jpSports="ジョギング";
				break;
			case "soccor":
				jpSports="サッカー";
				break;
			case "baseball":
				jpSports="野球";
				break;
			case "swimming":
				jpSports="水泳";
				break;
			}
			out.print( " " + jpSports + " " );
		}
		out.print("<p> ご協力ありがとうございました！ </p>");
	}
}
