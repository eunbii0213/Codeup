import java.util.Scanner;

public class Main{
	
	public static int sum(int num) {
		
		if(num==1) {
			return 1;
		}
		
		else if(num==0) {
			return 0;
		}
		
		return num+sum(num-1);
	
	}
	
	
	

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt(); //정수 n 입력
		
		System.out.println(sum(num));
		
	}

}

