package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReceivingAndShipping
 */
@WebServlet("/ReceivingAndShipping")
public class ReceivingAndShipping extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReceivingAndShipping() {
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

		//チェックボックス内容を受け取り
		String checkbox[] = request.getParameterValues("select");
		String nextEvent = request.getParameter("nextEve");

		//チェックボックス内容で処理分岐
		//内容有＆入荷ボタン押し	→入荷処理
		//内容有＆出荷ボタン押し	→出荷処理
		//内容無					→エラーメッセージを書籍一覧サーブレットへ
		String forward = "";
		if(checkbox !=null && checkbox.length>0) {
			if(nextEvent.equals("r")) {
				forward="ArrivalsServlet";
			}else if(nextEvent.equals("s")){
				forward="ShippingServlet";
			}
			request.setAttribute("books", checkbox);
		}else{
			String selectError="本が選択されていません";
			//リクエストスコープ準備
			request.setAttribute("error", selectError);
			forward="BookListServlet";
		}
		//フォワード処理
		RequestDispatcher rd = request.getRequestDispatcher(forward);
		rd.forward(request, response);

	}

}
