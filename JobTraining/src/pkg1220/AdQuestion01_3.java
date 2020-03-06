package pkg1220;

public class AdQuestion01_3 {
	public static void main(String[] args) {
		
	}
}

class MouseBox{
	int BoxCapa = 4;
	int mouse = 10;
	
	synchronized void mouseIn(int mouse) {
		this.mouse += mouse;
	}
	
	synchronized void mouseOut(int mouse) {
		this.mouse -= mouse;
	}
}