import java.util.Scanner;

class WebPage {
	private String name, title, description;

	public WebPage(String name, String title, String description) {
		this.name = name;
		this.title = title;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}


public class WebSiteGenerator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Webpage: ");
		in.nextLine();
		
		System.out.println("Enter Title: ");
		in.nextLine();
		
		System.out.print("Enter Description: ");
		in.nextLine();
		
		in.close();
		
	}

}
