package pkg1205;

public class MorningTest {
	public static void main(String[] args) {
		Pencil pencil1=new Pencil(5);
		ColorPencil pencil2 = new ColorPencil("赤",7);
		pencil1.showInfo();
		pencil2.showInfo();
		pencil1.white();
		pencil2.white();
	}
}

class ColorPencil extends Pencil{
	String color;
	ColorPencil() {
		
	}
	
	ColorPencil(String color,int diameter){
		this.color=color;
		this.diameter=diameter;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("鉛筆の色："+color);
	}
	
	public void white() {
		System.out.println("絵を描きます");
	}
	
}

class Pencil{
	int diameter;
	
	Pencil(){
		this.diameter=0;
	}
	
	Pencil(int diameter){
		this.diameter=diameter;
	}
	
	public void showInfo(){
		System.out.println("鉛筆の太さ："+diameter);
	}
	
	public void white() {
		System.out.println("文字を書きます");
	}
}