package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Day0129Servlet
 */
@WebServlet("/servlets/Day0129Servlet")
public class Day0129Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Day0129Servlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<h2> フォームのメソッド設定が違っています。postで送ってください。</h2>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		List<String> errorLog = new ArrayList<>();
		String mail1 = request.getParameter("mail1");
		String mail2 = request.getParameter("mail2");
		if (isNullEmpty(mail1) || isNullEmpty(mail2)) {
			errorLog.add("メールアドレスが入力されていません。");
		} else if (!mail1.equals(mail2)) {
			errorLog.add("メールアドレスが違います。");
		}
		String gend = request.getParameter("gend");
		if (isNullEmpty(gend)) {
			errorLog.add("性別が選択されていません。");
		} else {
			gend = getGenderName(gend);
		}
		int year = -1;
		int month = -1;
		int day = -1;
		try {
			year = Integer.parseInt(request.getParameter("year"));
			month = Integer.parseInt(request.getParameter("month"));
			day = Integer.parseInt(request.getParameter("day"));
			if (year < 1900 || year > 2020)
				errorLog.add("年の入力が不正です。");
			if (month < 1 || month > 12)
				errorLog.add("月の入力が不正です。");
			if (day < 1 || day > 31)
				errorLog.add("日の入力が不正です。");
		} catch (NumberFormatException e) {
			errorLog.add("生年月日には数字を入力してください。");
		}
		String zip1 = request.getParameter("zip1");
		String zip2 = request.getParameter("zip2");
		String prefecture = request.getParameter("pref");
		String tel = "";
		if (isNullEmpty(prefecture)) {
			errorLog.add("都道府県が選択されていません。");
		} else {
			prefecture = getPrefName(prefecture);
		}
		String tel1 = request.getParameter("tel1");
		String tel2 = request.getParameter("tel2");
		String tel3 = request.getParameter("tel3");
		if (isNullEmpty(tel1) || isNullEmpty(tel2) || isNullEmpty(tel3)) {
			errorLog.add("電話番号が入力されていません。");
		} else {
			tel = tel1 + "(" + tel2 + ")" + tel3;
		}
		String trigger = request.getParameter("trigger");
		if (isNullEmpty(trigger)) {
			errorLog.add("当社を知ったきっかけが選択されていません。");
		} else {
			trigger = getTriggerName(trigger);
		}
		response.setContentType("text/html;charset = utf-8");
		PrintWriter out = response.getWriter();

		if (!errorLog.isEmpty()) {
			for (String err : errorLog) {
				out.print("<p><font color=\"red\">" + err + "</font></p>");
			}
			out.print("<a href=\"javascript:history.back()\">前に戻る</a>");
		} else {
			out.print("メールアドレス：" + mail1 + "<br>");
			out.print("性別：" + gend + "<br>");
			out.print("生年月日：" + year + "年" + month + "月" + day + "日" + "<br>");
			out.print("郵便番号：" + zip1 + "-" + zip2 + "<br>");
			out.print("都道府県：" + prefecture + "<br>");
			out.print("電話番号：" + tel + "<br>");
			out.print("当社を知ったきっかけ：" + trigger + "<br>");
			out.print("で登録します。");
		}

	}

	private String getGenderName(String gend) {
		return "man".equals(gend) ? "男性" : "女性";
	}

	private String getTriggerName(String parameter) {
		String returnStr = "";
		switch (parameter) {
		case "cm":
			returnStr = "CM";
			break;
		case "web":
			returnStr = "WEB";
			break;
		case "introduce":
			returnStr = "紹介";
			break;
		default:
			break;
		}
		return returnStr;
	}

	private String getPrefName(String prefNum) {
		String[] prefNames = { "栃木県", "群馬県", "埼玉県", "茨城県", "千葉県", "東京都", "神奈川県" };
		return prefNames[Integer.parseInt(prefNum) - 1];
	}

	private boolean isNullEmpty(String str) {
		if (str == null || "".equals(str) || " ".equals(str)) {
			return true;
		}
		return false;
	}
}
