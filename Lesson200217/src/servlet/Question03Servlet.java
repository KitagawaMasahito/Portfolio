package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.FruitBean;

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
		//登録実施「登録しました」
		System.out.println("登録しました");

		//登録完了画面へフォワード
		RequestDispatcher dp = request.getRequestDispatcher("/Q3Done.jsp");
		dp.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//入力受け取り準備
		request.setCharacterEncoding("UTF-8");

		//入力受け取り
		String getName = request.getParameter("name");
		String getP = request.getParameter("price");

		//価格情報キャスト(String=>int)
		int getPrice = Integer.parseInt(getP);

		//フルーツ情報をFruitBean型で保持
		FruitBean fruit = new FruitBean(getName, getPrice);

		//セッション準備
		HttpSession session = request.getSession();

		//セッションスコープ保存
		session.setAttribute("kudamono", fruit);

		//確認画面「Q3tConfirm.jsp」へフォワード
		RequestDispatcher dp = request.getRequestDispatcher("/Q3tConfirm.jsp");
		dp.forward(request, response);
	}

}
