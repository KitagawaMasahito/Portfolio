package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Question03Servlet
 */
@WebServlet("/Question03Servlet")
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
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String getName = request.getParameter("name");
		String getSat = request.getParameter("satisfaction");
		String getOpinion = request.getParameter("opinion");

		int getSatis = Integer.parseInt(getSat);

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		out.print("<h1>アンケートのご協力ありがとうございます！</h1>");
		out.print("<p>お名前："+getName+"様</p>");

		out.print("<p>満足度：");
		switch (getSatis) {
		case 1:
			out.print("とても不満");
			break;
		case 2:
			out.print("やや不満");
			break;
		case 3:
			out.print("どちらともいえない");
			break;
		case 4:
			out.print("まあまあ満足");
			break;
		case 5:
			out.print("とても満足");
			break;
		default:
			break;
		}
		out.print("</p>");

		out.print("<p>ご意見："+getOpinion+"</p>");
		out.print("<p>----------------------------------------------以上でお預かりしました。</p>");
	}

}
