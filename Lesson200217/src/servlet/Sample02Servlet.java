package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.UserBean;

/**
 * Servlet implementation class Sample02Servlet
 */
@WebServlet("/Sample02Servlet")
public class Sample02Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sample02Servlet() {
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
		//フォームからのデータ受け取り準備
		request.setCharacterEncoding("UTF-8");

		//フォームからのデータ受け取り
		String id = request.getParameter("id");
		String nickName = request.getParameter("nickName");

		//UserBeanインスタンスに代入
		UserBean user = new UserBean(id, nickName);

		//セッション保存
		HttpSession session = request.getSession();
		session.setAttribute("u1", user);

		RequestDispatcher dp = request.getRequestDispatcher("/Sample02.jsp");
		dp.forward(request, response);
	}

}
