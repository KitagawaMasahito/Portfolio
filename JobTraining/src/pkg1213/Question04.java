package pkg1213;

public class Question04 {
	public static void main(String[] args) {
		Parts[] pc = new Parts[3];
		
		ConnectUseUsb[] usbUse = new ConnectUseUsb[2];
		
		pc[0] = new Hdd();
		pc[1] = new Mouse();
		pc[2] = new CardReader();
		
		usbUse[0] = new Mouse();
		usbUse[1] = new CardReader();
		
		pc[0].use();
		pc[1].use();
		pc[2].use();
		
		usbUse[0].connectUsb();
		usbUse[1].connectUsb();
	}
}

abstract class Parts{
	String name;
	abstract void use();
}

interface ConnectUseUsb{
	void connectUsb();
}

class Hdd extends Parts{
	void use() {
		System.out.println("ファイルを保存します");
	}
}

class Mouse extends Parts implements ConnectUseUsb{
	void use() {
		System.out.println("カーソルを動かします");
	}
	
	public void connectUsb() {
		System.out.println("マウスをUSBで接続しました");
	}
}

class CardReader extends Parts implements ConnectUseUsb{
	void use() {
		System.out.println("SDカードを利用できます");
	}
	
	public void connectUsb() {
		System.out.println("カードリーダーをUSBで接続しました");
	}
}
