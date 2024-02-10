//Vardan Vardanyan:
package Main;

import files.Files;
import keyInput.KeyInput;
import singleEntry.SingleEntry;
import extendFunctionality.ExtendFunctionality;
import menu.Menu;

public class MovieList {
	public static void main(String[] args) {
		//declarations
		Files myFile = new Files();
		KeyInput input = new KeyInput();
		SingleEntry entry = new SingleEntry();
		ExtendFunctionality extend = new ExtendFunctionality();
		Menu menu = new Menu();	
		
		String[] existingEntries = new String[myFile.getSize()];	//array to hold existing entries
		myFile.sendExistingEntry(existingEntries); //populate array with existing entries
		for(int i = 0; i < existingEntries.length;i++) {	//send populated array to ArrayList
			extend.push(existingEntries[i]);
		}
		
		
		while(menu.getSelection() != 'h') {
			menu.displayMenu();
			do {										//checks for correct menu choice
				input.setInput(input.in.next());
			}while(!menu.menuCheck(input.getInput()));
			
			switch(menu.getSelection()) {
			case 'a':										//for new entry
				int count = 0;
				System.out.println("Enter title > ");
				do {
					input.setInput(input.in.nextLine());
					count = entry.setEntries(input.getInput(), count);
					
				}while(count < 6);   //count < 6
				
				extend.push(entry.getEntry());  //send new entry to list
				myFile.writeToFile(entry.getEntry()); //write new entry to file
				break;
			case 'g':	//to delete an entry
				extend.displayList();
				System.out.println("choose an entry to delete");
				int userChoice;
				do {
					System.out.println("choose between 1-" + extend.getSize());
					userChoice = input.in.nextInt();
				}while(userChoice <= 0 || userChoice > extend.getSize());
				extend.deleteEntry(userChoice);	//deletes entry from list
				myFile.clearDB();//erases contents of file
				for(int i = 0; i < extend.getSize();i++) {	//rewrite to file with new list
					myFile.writeToFile(extend.getFromList(i));
				}
				extend.displayList();
				break;
			case 'h': //ends program
				System.out.println("Ending program");
				break;
			default:	//for searches
				input.in.nextLine();
				String menuChoice = menu.listMenu();
				input.setInput(input.in.nextLine());
				extend.listSearch(input.getInput(), menuChoice);
				break;
			}
			
			
		}
		
		
	}
}