package pkg200110;

public class Question02 {
	public static void main(String[] args) {
		GetString get = () -> {	return "Ver1.0";};
		System.out.println(get.getStr());
	}
}

interface GetString{
	String getStr();
}