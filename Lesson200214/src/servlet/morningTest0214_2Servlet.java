package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class morningTest0214_2Servlet
 */
@WebServlet("/morningTest0214_2Servlet")
public class morningTest0214_2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public morningTest0214_2Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num = 0;

		if (num>0) {
			System.out.println("forward1.jspへフォワード");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/forward1.jsp");
			dispatcher.forward(request, response);
		} else if(num<0) {
			System.out.println("forward2.jspへフォワード");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/forward2.jsp");
			dispatcher.forward(request, response);
		} else {
			System.out.println("YSEホームページへリダイレクト");
			response.sendRedirect("https://www.yca.ac.jp/");
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// TODO Auto-generated method stub
		doGet(request, response);

	}

}
