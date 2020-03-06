package pkg1105;

public class Sample04 {
	public static void main(String[] args) {
		String name = "Tom";
		int age = 20;
		char chara = 'c';
		age = 21;
		double pai = 3.14;
		
		double hankei = 2.3;
		
		System.out.println("私の名前は"+name+"です");
		System.out.println("年齢は"+age+"才です");
		System.out.println("円周率は"+pai+"です");
		System.out.println("半径12の円周は"+(24*pai)+"になります");
		System.out.println("半径5の円の面積は"+(5*5*pai)+"になります");
		
		System.out.println("\n実習ここまで\n");
		
		System.out.println("半径"+hankei+"の\n・円周="+(hankei*2*pai)+"\n・面積="+(hankei*hankei*pai)+"\nになります");
		System.out.println("友人のイニシャルは"+chara+"です");

	}
}
