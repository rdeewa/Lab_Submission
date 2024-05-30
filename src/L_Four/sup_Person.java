package L_Four;


class person {
	private int age;
	private String name;

	public person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}

class student extends person {
	private String grade;

	public student(String grade, String name, int age) {
		super(name, age);
		this.grade = grade;
	}


	public void display() {
		super.display(); 
		System.out.println("Student grade: " + grade);
	}
}

public class sup_Person {

	public static void main(String[] args) {
		student st = new student("A", "deewa", 12);
		st.display();

	}

}
