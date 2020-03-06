package Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Q2Servlet
 */
@WebServlet("/Q2Servlet")
public class Q2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Q2Servlet() {
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

		//受け取り準備
		request.setCharacterEncoding("UTF-8");
		String getTweet = request.getParameter("tweet");
		String getName = request.getParameter("name");

		//つぶやき用アプリケーションスコープ準備
		ServletContext application = this.getServletContext();
		//名前用セッションスコープ準備
		HttpSession session = request.getSession();

		//「ArrayListをスコープへ保存（ArrayListが無い場合にはNew）」
		//＝スコープにArrayListがあるか否かをcheck
		List<String> tweets = (List<String>)application.getAttribute("tweet");
		if(tweets == null) {
			tweets = new ArrayList<>();
		}
		tweets.add(getTweet);
		application.setAttribute("tweet", tweets);


		//名前をセッションスコープに保存
		session.setAttribute("nam", getName);

		//フォワード準備
		RequestDispatcher dp = request.getRequestDispatcher("/MorningTest.jsp");
		dp.forward(request, response);
	}

}
