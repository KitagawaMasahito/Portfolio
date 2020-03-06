package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.BookBean;
import model.UserBean;

/**
 * Servlet implementation class BookListServlet
 */
@WebServlet("/BookListServlet")
public class BookListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//------ログインサーブレットよりユーザ名をもらう------

		//セッションスコープに格納
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		UserBean user = (UserBean)session.getAttribute("user");

		//ログイン情報をセッションスコープに入れる
		session.setAttribute("user", user);


		//------エラーメッセージ受け取り------
		//ReceivingAndShippingよりエラーメッセージを受け取る
		String error = (String)request.getAttribute("error");

		//エラーメッセージがあれば、リクエストスコープに入れる
		if(error!=null) {
			request.setAttribute("error", error);
		}

		//------書籍情報取得------

		//ArrayList<BookBean>形式でもらう
		ArrayList<BookBean> bookList = new ArrayList<BookBean>();
		//DB(csvファイル)より取り込み
		Path path = Paths.get("C:\\Users\\1911sk08\\Desktop\\files\\booklist.csv");
		try {
			BufferedReader br = Files.newBufferedReader(path);
			String line = br.readLine();
			String[] bl = null;
			while((line = br.readLine())!=null) {
				bl=line.split(",");
				//Stringで格納された元intデータをキャストして復元
				int IdRd = Integer.parseInt(bl[0]);
				int priceRd = Integer.parseInt(bl[5]);
				int stockRd = Integer.parseInt(bl[6]);
				bookList.add(new BookBean(IdRd, bl[1], bl[2], bl[3], bl[4], priceRd, stockRd));
			}
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		//------書籍情報をjspに送る------

		//リクエストスコープ準備
		request.setAttribute("books", bookList);
		//フォワード処理
		RequestDispatcher rd = request.getRequestDispatcher("/BookList.jsp");
		rd.forward(request, response);

		//入荷処理
		//出荷処理

	}

}
