import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Scanner;

class Person {
	public String name;
	public String gender;
	public int age, height, weight;

	public Person(String name, String gender, int age, int height, int weight) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

}

public class RemoteCSVReader {

	public static void main(String[] args) {
		try {
			ArrayList<Person> people = new ArrayList<>();
			URL url = new URL("https://people.sc.fsu.edu/~jburkardt/data/csv/biostats.csv");
			URLConnection conn = url.openConnection();
			Scanner in = new Scanner(conn.getInputStream());
			in.nextLine();

			while (in.hasNextLine()) {
				String line = in.nextLine();
				String[] fields = line.split(",");
				if(fields.length == 5) {
					Person p = new Person(fields[0], fields[1],
						Integer.parseInt(fields[2].trim()), 
						Integer.parseInt(fields[3].trim()), 
						Integer.parseInt(fields[4].trim()));
					people.add(p);
			}
			}
			
			int sumHeight = 0, sumWeight = 0, sumAge = 0;
			for(Person p : people) {
				sumAge += p.getAge();
				sumHeight += p.getHeight();
				sumWeight += p.getWeight();
			}
			
			System.out.println("Average age: " + (sumAge / people.size()));
			System.out.println("Average height: " + (sumHeight / people.size()));
			System.out.println("Average weight: " + (sumWeight / people.size()));

			in.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
}
