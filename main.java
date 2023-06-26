import java.util.Scanner;

public class main {
	public static void main(String[] args) {
	
	//Find the maximum number from three entered numbers
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Please enter number 1");
	int number1 = scanner.nextInt();
	
	System.out.println("Please enter number 2");
	int number2 = scanner.nextInt();
	
	System.out.println("Please enter number 3");
	int number3 = scanner.nextInt();
	
	if( number1 >= number2 && number1 >= number3) {
		System.out.println("Largest number is: " + number1);
	}
	
	else if(number2 >= number1 && number2 >= number3) {
		System.out.println("Largest number is: " + number2);
	}
	else {
		System.out.println("Largest number is: " + number3);

	}
		
	
	
	}

}
