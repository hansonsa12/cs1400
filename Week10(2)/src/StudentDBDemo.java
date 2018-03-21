
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class StudentDBDemo {
  public static SimpleDateFormat dateFormatter = new SimpleDateFormat("MMM dd, yyyy");
  public static void main(String[] args) throws ParseException {
    // Defining a student database as a HashMap.
    HashMap<String, Student> studentsDB = new HashMap<>();
    
    studentsDB.put("asmith", new Student(123, "asmith", "Adam Smith", 
        dateFormatter.parse("Aug 12, 1980"), "asmith@example.com"));
    studentsDB.put("jadams", new Student(113, "jadams", "John Adams", 
        dateFormatter.parse("Jan 3, 1970"), "jadams@example.com"));
    studentsDB.put("fdoe", new Student(108, "fdoe", "Frank Doe", 
        dateFormatter.parse("Jul 30, 1985"), "fdoe@example.com"));
    studentsDB.put("jroberts", new Student(117, "jroberts", "Jane Roberts", 
        dateFormatter.parse("Feb 28, 1992"), "jroberts@example.com"));
  
    //TODO: Add five more students to this database
    studentsDB.put("shanson", new Student(116, "shanson", "Sam Hanson", 
            dateFormatter.parse("Mar 28, 1996"), "shanson@example.com"));
    studentsDB.put("shadley", new Student(165, "shadley", "Saige Hadley", 
            dateFormatter.parse("May 28, 1990"), "shadley@example.com"));
    studentsDB.put("acombe", new Student(149, "acombe", "Alec Combe",
    		dateFormatter.parse("Jan 31, 1997"), "acombe@example.com"));
    studentsDB.put("cbell", new Student(175, "cbell", "Connor Bell",
    		dateFormatter.parse("Oct 19, 1945"), "cbell@example.com"));
    studentsDB.put("cwatson", new Student(123, "cwatson", "Colten Watson",
    		dateFormatter.parse("Oct 21, 1959"), "cwatson@example.com"));

   
    // Print all students
    System.out.printf("%-10s %-15s %-20s %-12s %-20s\n", "ID", "USERNAME", "NAME", "DOB", "EMAIL");
    System.out.println("=================================================================================");
    for(String username: studentsDB.keySet()) {
      System.out.println(studentsDB.get(username));
    }
    
    //TODO: Display number of students in this database
    System.out.println(studentsDB.size());
  }
}

/* A student class */
class Student {
  private int id;
  private String username;
  private String name;
  private Date dob;
  private String email;
  
  public Student(int id, String username, String name, Date dob, String email) {
    this.id = id;
    this.username = username;
    this.name = name;
    this.dob = dob;
    this.email = email;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getDob() {
    return dob;
  }

  public void setDob(Date dob) {
    this.dob = dob;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
  
  public String toString() {
    //TODO: Look up the documentation of SimpleDateFormat and change the 
    //      output date format from "Aug, 12, 1970" to "08/12/1970".
    SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
    return String.format("%-10d %-15s %-20s %-12s %-20s", id, username, name, 
        df.format(dob), email);
  }
  
}