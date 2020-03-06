package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
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

		RequestDispatcher dispatcherSuccess = request.getRequestDispatcher("Menu.jsp");
		RequestDispatcher dispatcherFailure = request.getRequestDispatcher("LoginError.jsp");

		String adId = "admin";
		String adPass = "admin";

		String getId = request.getParameter("id");
		String getPass = request.getParameter("password");

		if(getId.equals(adId) && getPass.equals(adPass)) {
			dispatcherSuccess.forward(request, response);
		}else {
			dispatcherFailure.forward(request, response);
		}
	}

}
