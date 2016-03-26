import java.util.Scanner;

public class Grade {
	
	static int num;
	
	public static void getUserInput(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a grade value: ");
		String userInput = scanner.nextLine();
		num = Integer.parseInt(userInput);
	}
	
	public static void printGrade(){
		
		
		if (num<50){
			System.out.println("Your grade is: F");
		}
		else if (num<= 60){
			System.out.println("Your grade is: C");
		}
		else if (num <= 70){
			System.out.println("Your grade is: C+");
		}
		else if (num <= 80){
			System.out.println("Your grade is: B");
		}
		else if (num <= 90){
			System.out.println("Your grade is: B+");
		}
		else if (num <=100){
			System.out.println("Your grade is: A");
		}
		
					
		
	}
	public static void main(String[] args) {
		getUserInput();
		printGrade();
		
		
	}

}
