//USE TO EASILY PASS INFO AROUND AS A PARAMETER
package singleEntry;

public class SingleEntry {
	//Private fields
	private String title;
	private String actor1, actor2;
	private String year, runtime, director;
	private String singleEntry;
	
	//methods
	public String getTitle() {
		return this.title;
	}
	
	public String getActor1() {
		return this.actor1;
	}
	
	public String getActor2() {
		return this.actor2;
	}
	
	public String getYear() {
		return this.year;
	}
	
	public String getRuntime() {
		return this.runtime;
	}
	
	public String getDirector() {
		return this.director;
	}
	
	public String getEntry() {
		return this.singleEntry;
	}
	
	public void singleEntry(String input) {
		this.singleEntry = input;
	}

	
	public int setEntries(String input, int count) {
		switch(count) {
		case 0:
			if(input.length()<3) {
				System.out.println("Title must be at least 3 characters");
				return 0;
			}else {
				this.title = input;
				System.out.println("Enter year > ");
				return ++count;
			}
		case 1:
			this.year = input;
			System.out.println("Enter runtime (minutes) > ");
			return ++count;
		case 2:
			this.runtime = input;
			System.out.println("Enter actor 1 > ");
			return ++count;
		case 3:
			this.actor1 = input;
			System.out.println("Enter actor 2 > ");
			return ++count;
		case 4:
			this.actor2 = input;
			System.out.println("Enter Director > ");
			return ++count;
		case 5:
			this.director = input;
			singleEntry(getTitle() + "," + getYear() + "," + getRuntime() + "," + getActor1() + "," + getActor2() + "," + getDirector() );
			System.out.println("Entry added!");
			return 10;
		default:
			return 10;
		}
	}
}