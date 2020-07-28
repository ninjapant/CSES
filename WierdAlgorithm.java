import java.util.Scanner;
public class WeirdAlgorithm {
	static int algo(int n){
		if(n==1) {
			
		}
		else if(n%2==0) {
			System.out.print(n/2+" ");
			return algo(n/2);
		}
		else {
			System.out.print(n*3+1+" ");
			return algo((n*3)+1);
		}
		return 0;
	}
	public static void main(String []args) {
		
			Scanner scanner=new Scanner(System.in);
		    int n=scanner.nextInt();
		    System.out.print(n+" ");
		    algo(n);
	}
}
