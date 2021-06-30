import java.util.Scanner;

public class Main {
	
	public static int fibo(int n) {
		
		if(n==1) {
			return 1;
		}
		
		else if(n<1) {
			return 0;
		}
		
		return fibo(n-1)+fibo(n-2);
	}
	
	
	
	
	

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt(); //정수 n 입력
		
		System.out.println(fibo(num));
		
	}

}
