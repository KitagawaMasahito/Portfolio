package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.BookBean;

/**
 * Servlet implementation class ArrivalcheckinputServlet
 */
@WebServlet("/ArrivalcheckinputServlet")
public class ArrivalcheckinputServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ArrivalcheckinputServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		//箱の中の入荷数を受け取り
		String[] receive = request.getParameterValues("arrivalnum");

		HttpSession session = request.getSession();
		//ArrayListには選択された情報が入る
		ArrayList<BookBean> book = (ArrayList<BookBean>) session.getAttribute("bookmach");
		int num = 0;
		String error = "";
		//プルダウンで選択された数分まで回す
		for (int i = 0; i <= receive.length; i++) {
			BookBean bb = book.get(i);
			//			もし空文字でないなら
			if (receive[i] != null && !receive[i].equals("")) {
				//入荷数⇒数字
				num = Integer.parseInt(receive[i]);
				//在庫と入荷の数
				if (bb.getStock() + num <= 100) {
					//100以下⇒ OK
				} else {
					//在庫は100未満ですというエラーを出す準備
					error="在庫は100未満です";
				}
			} else {
				//入荷数の入力ないよ！ってエラーを出す準備
				error = "入荷数の入力ないよ！";
			}
		}
		if(error.equals("")) {
			RequestDispatcher rd = request.getRequestDispatcher("/");
			rd.forward(request, response);
		}else {
			request.setAttribute("error", error);
			RequestDispatcher rd = request.getRequestDispatcher("/BookListServlet");
			rd.forward(request, response);
		}
	}
}
