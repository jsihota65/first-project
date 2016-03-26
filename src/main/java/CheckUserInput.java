import java.util.Scanner;

public class CheckUserInput {

	
	public static int num;
	
	public static void getUserInput(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		String userInput = scanner.nextLine();
		num = Integer.parseInt(userInput);
	}
	
	public static void checkNumberValue(){
		if (num>10){
			System.out.println("Number is greater than 10");
		}
		else if(num<10){
			System.out.println("Number is less than 10");
		}
		else{
			System.out.println("Number is equal to 10");
		}
	}
	
	public static void main(String[] args) {
		getUserInput();
		checkNumberValue();
		
	}

}
