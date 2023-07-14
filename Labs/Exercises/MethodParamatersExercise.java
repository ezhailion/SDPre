import java.util.Scanner;
public class MethodParamatersExercise{
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String item;
		String quantity;
		System.out.print("Please enter your inventory item:  ");
		item = kb.nextLine();
		System.out.print("Please enter the quantity: ");
		quantity = kb.nextLine();
		printInventory(item, quantity);
	}
	public static void printInventory(String inventoryItem, String numberOfInventoryItems){
		System.out.println("There are currently " + numberOfInventoryItems + " " + inventoryItem + " left.");
	}


} 