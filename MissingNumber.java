import java.util.Arrays;
import java.util.Scanner;
public class MissingNumber {
	public static void main(String []args) {
			Scanner scanner=new Scanner(System.in);
		    int n=scanner.nextInt();
		    int arr[]=new int[n];
			for (int i = 0; i < n-1; i++) {
				arr[i]=scanner.nextInt();
			}
			int diff=0;
			Arrays.sort(arr);
			for (int i = 0; i < n-1; i++) {
				diff=arr[i]-arr[i+1];
				if( diff != -1) {
					System.out.println(arr[i]+1);
				}
			}
	}
}
