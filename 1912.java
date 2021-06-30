import java.util.Scanner;

public class Main {
	
	public static int factorial(int n) {
		
		
		if(n<1||n==1) {
			return 1;
		}
		
		return factorial(n-1)*n;
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt(); //정수 n 입력
		
		System.out.println(factorial(num));
		
	}

}

