import java.util.Scanner;

public class Objective9Lab3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int selection = 0;
		int choice1 = 1;
		int choice2 = 2;
		int choice3 = 3;


		while(selection != choice3) {
			printMenu();
			
			selection = scanner.nextInt();

			if(selection == choice1){				
				System.out.println("Hello Human");
			}		
			else if(selection == choice2) {
				System.out.println("Apples, Bananas, Coconuts");
			}

			else{
				System.out.println("Goodbye");
			}

		}

		scanner.close();


	}


	public static void printMenu() {
		System.out.println("____Menu____");
		System.out.println("1. Say Hello");
		System.out.println("2: List my favorite foods");
		System.out.println("3: Exit");
		System.out.println();
	}
}