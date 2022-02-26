import java.util.Scanner;

public class printAnumber {
public static void main(String[] args) {
	
	//creates a reader instance which takes
	//input from standard input - keyboard
	Scanner reader = new scanner(System.in);
	System.out.println("enter a number:");
	
	//nextInt() reads the next integer from the keyboard
	int number  = reader.nextInt();
	
	//println() prints the following line to the output screen
	System.out.println("enter a number:"+ number);
	
}
}
