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
		//セッション準備
		HttpSession session = request.getSession();

		//おみくじ判定
		String omikuji ="";
		int omikujiNo=(int)(Math.random()*5);
		switch (omikujiNo) {
		case 0:
			omikuji = "凶";
			break;
		case 1:
			omikuji = "末吉";
			break;
		case 2:
			omikuji = "中吉";
			break;
		case 3:
			omikuji = "吉";
			break;
		case 4:
			omikuji = "大吉";
			break;
		}

		//おみくじ判定結果保存
		session.setAttribute("kekka", omikuji);

		//フォワード処理
		RequestDispatcher dp = request.getRequestDispatcher("/Question02.jsp");
		dp.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
