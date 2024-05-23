package find_area;

	public class Student {
	    private String name;

	    public Student() {
	        this.name = "Unknown";
	    }

	    public Student(String name) {
	        this.name = name;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	   
	    public void printName() {
	        System.out.println("Student's name: " + name);
	    }

	    public static void main(String[] args) {
	      
	        Student student1 = new Student(); 
	        Student student2 = new Student("Ram");
	        Student student3 = new Student("Shayam");
	        
	        student1.printName();
	        student2.printName();
	        student3.printName();
	    }
	}
