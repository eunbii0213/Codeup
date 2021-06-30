import java.util.Scanner;

public class Main {
	
	static int max;
	static int count;
	
	public static int show(int number) {
		
		
		System.out.println(count);
		
		if(count==max){
			return max;
		}
		
		count++;
		
		
		return show(number-1);
	}
	
	
	
	

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt(); //정수 n 입력
		
		max = num;
		count=1;
		show(num);
		
		
		
	}

}

