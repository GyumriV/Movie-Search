//EXTENDS FUNCTIONALITY OF SINGLE ENTRY
//HOLDS DATABASE IN AN ARRAYLIST
//DOES THE SEARCHING
package extendFunctionality;

import java.util.ArrayList;
import singleEntry.SingleEntry;
import java.util.StringTokenizer;

public class ExtendFunctionality extends SingleEntry{
	
	private static ArrayList<String> arr = new ArrayList<String>();
	private StringTokenizer st;
	
	
	public void push(String item) {
		arr.add(item);
	}
	
	public int getSize() {
		return arr.size();
	}
	
	public void displayList() {
		for(int i = 0; i<arr.size();i++) {
			System.out.println((i+1) + ") " + arr.get(i));
		}
	}
	
	public String getFromList(int input) {
		return arr.get(input);
	}
	
	public void deleteEntry(int input) {
		arr.remove(input-1);
	}
	
	public void listSearch(String input, String type) {
		int found = 0;
		for(int i = 0;i<arr.size();i++) {
			String temp = arr.get(i);
			if(temp.toLowerCase().contains(input.toLowerCase())) {
				st = new StringTokenizer(temp);
				String Title = "Title: " + st.nextToken(",");		//seperates tokens
				String Year = "Year: " + st.nextToken(",");
				String Runtime = "Runtime: " + st.nextToken(",") + " minutes";
				String Actors = "Actors: " + st.nextToken(",")+ ","+ st.nextToken(",");
				String Director = "Director: " + st.nextToken(",");
				if(type == "title") {
					if(Title.toLowerCase().contains(input.toLowerCase())) {
						System.out.println(Title + "\n" + Actors + "\n" + Director + "\n" + Year + "\n" + Runtime + "\n");
						found++;
					}
				}
				if(type == "actor") {
					if(Actors.toLowerCase().contains(input.toLowerCase())) {
						System.out.println((i+1) + ") " + arr.get(i));
						found++;
					}
				}
				if(type == "year") {
					if(Year.toLowerCase().contains(input.toLowerCase())) {
						System.out.println((i+1) + ") " + arr.get(i));
						found++;
					}
				}
				if(type == "runtime") {
					if(Runtime.toLowerCase().contains(input.toLowerCase())) {
						System.out.println((i+1) + ") " + arr.get(i));
						found++;
					}
				}
				if(type == "director") {
					if(Director.toLowerCase().contains(input.toLowerCase())) {
						System.out.println((i+1) + ") " + arr.get(i));
						found++;
					}
				}
			}
		}
		if(found == 0) {
			System.out.println("no titles found for " + type + ": " + input);
		}
	}
	
	
	
}