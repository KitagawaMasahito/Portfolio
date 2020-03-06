package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Question05Servlet
 */
@WebServlet("/Question05Servlet")
public class Question05Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Question05Servlet() {
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
		request.setCharacterEncoding("UTF-8");

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		//名前
		String getName = request.getParameter("name");

		//月(int変換)
		String getM = request.getParameter("month");
		int getMonth = Integer.parseInt(getM);

		//日(int変換)
		String getD = request.getParameter("day");
		int getDay = Integer.parseInt(getD);

		//時(int変換)
		String getT = request.getParameter("time");
		int getTime = Integer.parseInt(getT);

		//人数
		String getSum = request.getParameter("sum");

		//オプション
		String getOptions[] = request.getParameterValues("option");

		out.print("<h1>ご予約を受け付けました！</h1>");
		out.print("<p>日　　時　："+getMonth+"月　"+getDay+"日　"+getTime+"時</p>");
		out.print("<p>名　　前　："+getName+"　様</p>");
		out.print("<p>人　　数　："+getSum+"名様</p>");
		out.print("<p>オプション：");

		for(int i=0;i<getOptions.length;i++) {
			switch(getOptions[i]) {
			case "flower":
				out.print("[花束]");
				break;
			case "cake":
				out.print("[お誕生ケーキ]");
				break;
			case "play":
				out.print("[ピアノ生演奏]");
				break;
			case "picture":
				out.print("[写真撮影]");
				break;
			}
		}

		out.print("をご用意いたします。</p>");
		out.print("<br><p>スタッフ一同心よりお待ち申し上げております。</p>");
	}

}
