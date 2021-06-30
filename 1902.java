import java.util.Scanner;

public class Main{
	
	public static int show(int num) {
		
		System.out.println(num);
		
		if(num==1) {
			return 1;
		}
		
		return show(num-1);
		
	}//
	
	
	
	
	
	

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt(); //정수 n 입력
		
		show(num);
		
		
	}

}

