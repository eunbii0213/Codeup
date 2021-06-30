import java.util.Scanner;

public class Main {
	
	static int sum=0;
	
	public static int odd(int a, int b) {
		
		
		
		if(a%2==1) {
			System.out.print(a + " ");
		}
		
		if(a==b) {
			return 0;
		}
		
		return odd(a+1,b);
	}
	
	
	

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt(); //정수 a 입력
		int b = scanner.nextInt(); //정수 b 입력
		
		odd(a,b);
		
	}

}

