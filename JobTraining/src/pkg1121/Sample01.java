package pkg1121;

public class Sample01 {
	public static void main(String[] args) {
		int[][] nums = new int[2][2];
		nums[0][0]=1;
		nums[0][1]=2;
		nums[1][0]=3;
		nums[1][1]=4;
		System.out.print(nums[0][1]+" ");
		System.out.println(nums[1][0]);
		System.out.println("--------------------");
		int[][] nums2 = {{1,2},{3,4}};
		System.out.print(nums2[0][1]+" ");
		System.out.println(nums[1][0]);
	}
}
