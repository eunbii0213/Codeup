import java.util.Scanner;


public class Main {
	

	public static void col(int n) {
		
		if(n==1) {
			return;
		}
		
		if(n%2==0) {
			
			col(n/2);
			System.out.println(n/2);
			
		}// 짝수인 경우
		
		else if(n%2!=0) {
			
			col((3*n)+1);
			System.out.println((3*n)+1);
			}// 홀수인 경우
	}
	
		
	
	
	

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt(); //정수 n 입력
		
		if(n==1) {System.out.println(1); return;}
		
		
		col(n);
		
		System.out.println(n);
	}

}

