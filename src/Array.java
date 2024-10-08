import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {5,3,8,2,1};
		secondlarge(arr1);
		secondsmall(arr1);
		
	}
	 public static void secondlarge(int[] arr1) {
		 Arrays.sort(arr1);
		 int n=arr1.length;
		 int find=0;
		 find =arr1[n-2];
		 System.out.println(find);
	 }
	 public static void secondsmall(int[] arr1) {
		 Arrays.sort(arr1);
		 int find1=0;
		 for(int i=1;i<2;i++) {
			
		System.out.println(arr1[1]);
		 
			
			}
	 }
}
