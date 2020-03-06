package pkg200108;

public class Question02_2 {
	public static void main(String[] args) {
		WhiteLine line = new WhiteLine() {

			@Override
			public void draw() {
				System.out.println("直線を描きます");
			}
		};
		line.draw();
	}
}

interface WhiteLine{
	void draw();
}