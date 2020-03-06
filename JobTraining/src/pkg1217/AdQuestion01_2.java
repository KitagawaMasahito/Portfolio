package pkg1217;

public class AdQuestion01_2 {
	public static void main(String[] args) {
		int age = 1000;
		try {
			System.out.println(checkAge(age));
		} catch (MismatchAgeException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	public static int checkAge(int age) throws MismatchAgeException {
		if(age>=0 && age<=150) {
			return age;
		}else {
			throw new MismatchAgeException("年齢として無効な数値です");
		}
	}
}

class MismatchAgeException extends Exception{
	MismatchAgeException(String message) {
		super(message);
	}
}