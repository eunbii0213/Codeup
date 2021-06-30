import java.util.Scanner;


public class Main {
	

	public static void binary(int n) {
		
		if(n==0) {
			return;
			
		}
		
		binary(n/2);
		
		System.out.print(n%2);
		
	
		
		
	}

	
	

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt(); //정수 n 입력
		
		if(n==0) {
			System.out.println(0);
			return;
		}
		
		binary(n);
		
	}

}

