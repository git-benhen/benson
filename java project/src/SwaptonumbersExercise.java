
public class SwaptonumbersExercise {
public static void main(String[] args) {
	
	float first = 2.50f, second = 3.50f;
	System.out.println("--before swap--");
	System.out.println("First number = "+ first);
	System.out.println("second number = "+second);
	
	float temporary = first
			;
	
	first = second;
	
	second = temporary;
	
	System.out.println("--after swap--");
	System.out.println("first number "+ first);
	System.out.println("second number"+second);
	
	
}
}
