package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.BookBean;

/**
 * Servlet implementation class ShippingConfirmServlet
 */
@WebServlet("/ShippingConfirmServlet")
public class ShippingConfirmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShippingConfirmServlet() {
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

		//------書籍情報取得------

		//受け取り準備
		request.setCharacterEncoding("UTF-8");

		//テキストボックス内容を受け取り
		String shippingSum[] = request.getParameterValues("shipSum");

		//テキスト内容からエラー判別処理
		//内容有＆数字＆在庫数以下	→OK
		//内容有＆数字＆在庫数以上	→"在庫の上限は100です"
		//内容無し|数字以外			→"数字を入力してください"


		//セッションスコープ呼び出し
		HttpSession session = request.getSession();
		ArrayList <BookBean> book = (ArrayList <BookBean>)session.getAttribute("bookmach");


	}

}
