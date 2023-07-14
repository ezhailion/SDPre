import java.util.Scanner;

public class Objective7Lab5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int selection = 0;
		int selection1 = 1;
		int selection2 = 2;
		int selection3 = 3;


		while (selection != selection3) {
			System.out.println("_____Menu______");
			System.out.println("1: Say Hello");
			System.out.println("2: List My favorite foods");
			System.out.println("3: Exit");
			System.out.println();



			selection = scanner.nextInt();

			if(selection == selection1){				
				System.out.println("Hello Human");
			}		
			else if(selection == selection2) {
				System.out.println("Apples, Bananas, Coconuts");
			}

			else{
				System.out.println("Goodbye");
			}

		}
				scanner.close();
				
		}
		
	}
