//HANDLES DECLARING SCANNER OBJECT, RETRIEVEING TEXT INPUT
package keyInput;

import java.util.Scanner;

public class KeyInput {
	
	private String userInput;
	
	public Scanner in = new Scanner(System.in);
	
	
	public String getInput() {
		return this.userInput;
	}
	
	public void setInput(String userInput) {
		this.userInput = userInput;
	}
}
