package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class morningTest0214Servlet
 */
@WebServlet("/morningTest0214Servlet")
public class morningTest0214Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public morningTest0214Servlet() {
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
		String getName = request.getParameter("name");
		String getPostalCode = request.getParameter("postalCode");
		String getPref = request.getParameter("pref");
		String getAddress = request.getParameter("address");
		String getAddress2 = request.getParameter("address2");

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<h1>入力情報確認</h1>");
		out.print("<p>お名前："+getName+"</p>");
		out.print("<p>郵便番号："+getPostalCode+"</p>");
		out.print("<p>住所："+getPref+getAddress+getAddress2+"</p>");
	}

}
