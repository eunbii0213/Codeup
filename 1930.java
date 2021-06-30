import java.util.Scanner;


public class Main{
	
	
	static int sum ;
	

	public static int SuperSum(int k, int n) {
		
		sum=0;//이거 안 하면 return값 외에 다른 값들이 채워짐
		//SuperSum은 k가 0일때까지 계속 더하는거기때문에 return값만 더하는 것임
		
	
		
		
		if(k==0) {
		
			return n;
		}
		
	
		for(int i=1;i<=n;i++) {
			sum += SuperSum(k-1,i);
		}
		
		return sum;
		
	}
	

	public static void main(String[] args) {
		
		int k;
		int n;
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNextInt()) {
			k=scanner.nextInt();
			n=scanner.nextInt();
			sum=0;
			System.out.println(SuperSum(k, n));
		}
			
	}

}

