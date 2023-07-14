import java.util.Scanner;

public class Objective5Lab3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int userNum;
		int num1 = 0; 
		System.out.println("Please enter a number: ");
		userNum = scanner.nextInt();

		if(userNum > num1) {
			System.out.println(userNum);
			System.out.println("The number is positive");
		}	
		else if(userNum < num1) {
			System.out.println(userNum);
			System.out.println("The number is negative");
		}
		

		else if(userNum == num1) {
			System.out.println(userNum);
			System.out.println("The number is neither positive nor negative");

		}
		









		scanner.close();





	}

}