
public class operatordemo {
 public static void main(String[] args) {
	int num1=10;
	int num2=30;
	
	//addition
	
	int add=num1=num2;//+ is the addition operator
	
	System.out.println(add);
	
	//+ operator is over loaded-for numbers it will do addition
	//and for characters it will do concatenation

	System.out.println("addition...."+add);//here + is doig concatenation
	
	//Deletion
	int sub=num1-num2;
	 System.out.println("subtraction..."+sub);
	 
	 //Multiplication
	 int mul=num1*num2;
			 System.out.println("multiplication..."+mul);
	 
			 //Divition
			 int div=num1/num2;
			 System.out.println("division-(quotient)..."+div);
			 
			 //Mod
			 int mod=num1%num2;
			 System.out.println("mod-division(Reminder)...."+mod);
			 
			 //== this double equalto is used for comparison
			 System.out.println(num1==num2);// this will return a boolean-true or false
			 //if both are equal it will return true otherwise it will return false
			 
}
}
