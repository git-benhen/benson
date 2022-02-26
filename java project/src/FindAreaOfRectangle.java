import java.util.Scanner;

public class FindAreaOfRectangle {
public static void main(String[] args) {
	Scanner scanner  = new Scanner(System.in);
	System.out.println(" Enter the length of rectangle:");
	double length = scanner.nextDouble();
	System.out.println("enter the width if rectangle:");
	Double width = scanner.nextDouble();
	//Area = length*width;
	Double area = length*width;
	System.out.println("Area of the rectsngle is:"+area);
	
}
}
