package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.UserBean;

/**
 * Servlet implementation class sample01servlet
 */
@WebServlet("/sample01servlet")
public class sample01servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public sample01servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		//ログインID,passwordの照合
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String password = request.getParameter("password");

		//members.csv読み込んで、照合
		Path path = Paths.get("C:\\Users\\1911sk08\\Desktop\\files\\members.csv");
		BufferedReader br = Files.newBufferedReader(path);
		String line = br.readLine();
		String forward = "/sample01.jsp";

		//ログインIDとPasswordを検索
		try {
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				//ユーザー、パスを区切る
				String[] userline = line.split(",");
				//ログインID,passwordの合致の時
				if (id.equals(userline[0]) && password.equals(userline[1])) {
					UserBean user = new UserBean(userline[0], userline[2]);
					//セッションスコープへ保存
					HttpSession session = request.getSession();
					session.setAttribute("user", user);
					//booklistへ飛ばす
					forward = "BookListServlet";
					break;

				//ログインID,passwordの合致でない時
				}else if (!id.equals(userline[0]) || !password.equals(userline[1])) {
					String result = "ユーザー名/パスワードが違います";
					//セッションスコープへ保存
					request.setAttribute("result", result);

					//sample01.jspへ飛ばす
					forward = "/sample01.jsp";
				}
			}
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		//照合結果が合致した場合は、書籍一覧へ飛ばす
		RequestDispatcher rd1 = request.getRequestDispatcher(forward);
		rd1.forward(request, response);
	}
}
