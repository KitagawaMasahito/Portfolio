package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Question02Servlet
 */
@WebServlet("/Question02Servlet")
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
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String getName = request.getParameter("nickname");
		String getLike = request.getParameter("like");

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		out.print(getName+"さん。アンケートご協力ありがとうございます！");
		if(getLike.equals("cat")) {
			out.print("<p>やっぱり、猫は最高ですよね！<p>");
			out.print("<img src=./img/cat.jpg>");
		}else if(getLike.equals("dog")) {
			out.print("<p>やっぱり、犬は最高ですよね！<p>");
			out.print("<img src=./img/dog.jpg>");
		}
	}

}
