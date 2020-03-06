package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Sample03ConfirmServlet
 */
@WebServlet("/Sample03ConfirmServlet")
public class Sample03ConfirmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sample03ConfirmServlet() {
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
		//リクエスト受け取り準備
		request.setCharacterEncoding("UTF-8");
		String button = request.getParameter("button");

		//button="confirm"	⇒　Sample03Finish.jspへ
		//button="cancel"	⇒　Sample03.htmlへ(初めに戻る)
		//データ形式：Stringで指示
		String forwardUrl="";
		if(button.equals("confirm")) {
			forwardUrl="Sample03Finish.jsp";
		}else if(button.equals("cancel")) {
			forwardUrl="Sample03.html";
		}

		RequestDispatcher dp = request.getRequestDispatcher(forwardUrl);
		dp.forward(request, response);
		}

}
