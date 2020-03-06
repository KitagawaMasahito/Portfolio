package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Sample03Servlet
 */
@WebServlet("/Sample03Servlet")
public class Sample03Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sample03Servlet() {
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

		String bookNum = request.getParameter("book");
		String book ="";
		if("1".equals(bookNum)) {
			book="赤い本";
		}else if("2".equals(bookNum)){
			book="青い本";
		}else if("3".equals(bookNum)) {
			book="黄色い本";
		}

		String bookQuantity = request.getParameter("quantity");

		HttpSession session = request.getSession();

		session.setAttribute("book", book);
		session.setAttribute("quantity", bookQuantity);

		RequestDispatcher dp = request.getRequestDispatcher("Sample03Confirm.jsp");
		dp.forward(request, response);
	}

}
