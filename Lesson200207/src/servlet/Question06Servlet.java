package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Question06Servlet
 */
@WebServlet("/Question06Servlet")
public class Question06Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Question06Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		String get1 = request.getParameter("op1");
		int getOp1 = Integer.parseInt(get1);

		String get2 = request.getParameter("op2");
		int getOp2 = Integer.parseInt(get2);

		String getOperator = request.getParameter("operator");

		switch(getOperator) {
		case "plus":
			out.print(getOp1+"　＋　"+getOp2+"　=　"+(getOp1+getOp2));
			break;
		case "minus":
			out.print(getOp1+"　－　"+getOp2+"　=　"+(getOp1-getOp2));
			break;
		case "multiply":
			out.print(getOp1+"　×　"+getOp2+"　=　"+(getOp1*getOp2));
			break;
		case "division":
			if(getOp1%getOp2==0) {
				out.print(getOp1+"　÷　"+getOp2+"　=　"+(getOp1/getOp2));
				break;
			}else {
				out.print(getOp1+"　÷　"+getOp2+"　=　"+(getOp1/getOp2)+"　・・・　"+(getOp1%getOp2));
				break;
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
