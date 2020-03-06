package pkg1119;

public class Sample08 {
	public static void main(String[] args) {
		
		int[] nums = new int[3];
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		System.out.println("nums[1]="+nums[1]);
		
		String[]  seasons = {"春","夏","秋","冬"};
		System.out.println("seasons[1]="+seasons[1]);
		
		System.out.println("nums length="+nums.length);
		System.out.println("seasons length="+seasons.length);
		
		int[] num2 = {1,2,3,4,5,6,7,8,9,0};
		System.out.println("num2[9]="+num2[9]);
		System.out.println("num length="+num2.length);
	}
}
