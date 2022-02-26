
public class FloydsTriangle {
public static void main(String[] args) {
	int rows,numbers = 1,counter,j;
	//To get te users input
	Scanner input = new Scanner(System.in);
	System.out.println(" Enter the number of roes for floyd's triangle:");
	
	//copying users input into an integer variable named rows
	rows = input.nextInc();
	System.out.println("Floyed's triangle");
	System.out.println("*********");
	for( counter = 1; counter <= rows ; counter++)
	{
		for( j = 1; j<= counter ; j++)
		{
			System.out.println(number+" ");
			//Incrementing the number value
			number++;
			
		}
		//for new line 
		System.out.println();
	}
}
}
