package files;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class Files {
	
	private File fileObj = new File("db.txt");
	private Scanner readFile;
	private int count = 0; //count of entry location
	private int size = 0;	//how many entries there are
	
	public Files() {
		try {
			if(fileObj.createNewFile()) {
				System.out.println("File created: " + fileObj.getName());
			}
		}catch (IOException e) {
			System.out.println("An error has occurred");
		}
	}
	
	public void sendExistingEntry(String[] arr) {
		try {
			readFile = new Scanner(fileObj);
			while(readFile.hasNextLine()) {
				count++;
				String entry = readFile.nextLine();
				arr[count-1] = (entry);
			}
			readFile.close();
		}catch(IOException e) {
			System.out.println("something went wrong");
		}
	}
	
	public void writeToFile(String entry) {
		try {
			FileWriter fw = new FileWriter(fileObj, true);
			count++;
			fw.write(entry + "\n");
			fw.close();
		}catch(IOException e) {
			System.out.println("something went wrong");
		}
	}
	
	public void deleteEntry(int input) {
		
	}
	
	public int getSize() {
		try {
			readFile = new Scanner(fileObj);
			while(readFile.hasNextLine()) {
				readFile.nextLine();
				size++;
			}
			readFile.close();
		}catch(IOException e) {
			System.out.println("An error has occurred");
		}
		return this.size;
	}
	
	public void clearDB() {
		try {
		new FileWriter(fileObj, false).close();
		}catch(IOException e) {
			System.out.println("an error has occured");
		}
	}
}