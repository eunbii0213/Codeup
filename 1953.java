import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main{
	
	public static void printStarLine(int m) {
		if(m>0) {
			printStarLine(m-1);
			System.out.print("*");
		}
	}
	
public static void printTriangle(int n) {
		
	if(n>0) {
		printTriangle(n-1);
		printStarLine(n);
		System.out.println();
	}
	}

public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		int n= scanner.nextInt();
		scanner.close();
		printTriangle(n);
	

	}

}

