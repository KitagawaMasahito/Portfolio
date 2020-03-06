package pkg1126;

public class Training2_005 {
	public static void main(String[] args) {
		ErrorLog error1 = new ErrorLog("ファイルが見つかりません","2019/12/1 PM4:14");
		ErrorLog error2 = new ErrorLog();

		System.out.println(error1.accrualDate+" "+error1.message);
		System.out.println(error2.accrualDate+" "+error2.message);
	}
}
class ErrorLog{
	String message;
	String accrualDate;
	public ErrorLog() {
		message="エラー内容不明";
		accrualDate="1900/1/1 AM0:00";
	}
	public ErrorLog(String message,String accrualDate) {
		this.message=message;
		this.accrualDate=accrualDate;
	}
}