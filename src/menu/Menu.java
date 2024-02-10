//SHOWS DIFFERENT MENUS, RETRIEVES CHOICE SELECTION
package menu;

public class Menu {
	
	private char selection;
	
	public void displayMenu() {
		System.out.println("Movie Library!\n");
		System.out.println("a) New Entry \nb) Search by actor \nc) Search by year \nd) Search by runtime (in minutes) ");
		System.out.println("e) Search by director \nf) Search by title \ng) Delete Entry \nh) Quit");
	}
	
	public boolean menuCheck(String userInput) {
		String input = userInput.toLowerCase();
		this.selection = input.charAt(0);
		if(this.selection < 'a' || this.selection > 'h') {
			System.out.println("Please choose between a-g");
			return false;
		}else {
			return true;
		}
	}
	
	public char getSelection() {
		return this.selection;
	}
	
	public String listMenu() {
		switch(this.selection) {
		case 'b':
			System.out.print("Enter actor > ");
			return "actor";
			
		case 'c':
			System.out.print("Enter year > ");
			return "year";
			
		case 'd':
			System.out.print("Enter runtime (minutes) > ");
			return "runtime";
			
		case 'e':
			System.out.print("Enter Director > ");
			return "director";
			
		case 'f':
			System.out.print("Enter title > ");
			return "title";
		default:
			return null;
		}
	}
	
	public void setEntry(String input, int i) {
		switch(i) {
		case 1:
			System.out.println("Enter year > ");
		}
	}
	
	
}
