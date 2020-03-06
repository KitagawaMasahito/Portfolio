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

/**
 * Servlet implementation class ShippingServlet
 */
@WebServlet("/ShippingServlet")
public class ShippingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShippingServlet() {
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

		//エラーがRequestスコープに存在する場合は、取得し再度Requestスコープヘ格納

		//booksの情報で照合、booklist.csvにあるか確認
		//照合した情報を表示される
		//入力された入荷数受け取る
		//受取って、入荷数

		request.setCharacterEncoding("UTF-8");
		//bookの情報 String[] （チェック情報）で受け取る

		//入荷数
		ArrayList<BookBean> booklist = new ArrayList<>();

		Path path = Paths.get("C:\\Users\\1911sk08\\Desktop\\files\\booklist.csv");
		try {
			BufferedReader br = Files.newBufferedReader(path);
			String line = br.readLine();
			String[] bl = null;
			while ((line = br.readLine()) != null) {
				bl = line.split(",");
				//Stringで格納された元intデータをキャストして復元
				int IdRd = Integer.parseInt(bl[0]);
				int priceRd = Integer.parseInt(bl[5]);
				int stockRd = Integer.parseInt(bl[6]);
				booklist.add(new BookBean(IdRd, bl[1], bl[2], bl[3], bl[4], priceRd, stockRd));
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

		//チェックされた項目をとる
		String[] check = request.getParameterValues("select");

		//booksの情報で照合、booklist.csvにあるか確認

		ArrayList<BookBean> bookmach = new ArrayList<>();
		for (int i = 0; i < check.length; i++) {
			for (int j = 0; j < booklist.size(); j++) {
				if (Integer.parseInt(check[i]) == booklist.get(j).getId()) {
					bookmach.add(new BookBean(booklist.get(j).getId(), booklist.get(j).getTitle(),
							booklist.get(j).getAuthor(), booklist.get(j).getRelease(), booklist.get(j).getIsbn(),
							booklist.get(j).getPrice(), booklist.get(j).getStock()));
					break;
				}
			}
		}

		//		request.setAttribute("books", books);

		//		Path path = Paths.get("C:\\Users\\1911sk16\\Desktop\\files\\booklist.csv");
		//		BufferedReader br = Files.newBufferedReader(path);
		//		String line = br.readLine();

		//あれば、入荷数を増やす
		//ただし在庫の上限は100
		//100以上なら「NG」在庫の上限が100を超えています
		//		while ((line = br.readLine()) != null) {
		//			if (stock <= 100) {
		//				String result = "在庫の上限が100を超えています";
		//
		//				//100以下ならば「OK」、入荷数を増やして、返す
		//			} else if (stock >= 100) {
		//				String result = "在庫を増やします";
		//			}
		//
		//		}

		//		//ArrayList <BookBean>
		//		ArrayList<Book> inputnum = new ArrayList<>();
		//		inputnum.add(new Book("本の入荷数"));

		//ArrayList を Session スコープへ保存
		HttpSession session = request.getSession();
		session.setAttribute("bookmach", bookmach);

		RequestDispatcher rd = request.getRequestDispatcher("/Shipping.jsp");
		rd.forward(request, response);
	}

}
