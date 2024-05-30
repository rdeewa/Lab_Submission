package L_Four;

class employe{
	double salary;
	String name;
	
	public employe(double empsalary, String empname) {
		this.name = empname;
		this.salary = empsalary;
	}
	
	public void display() {
		System.out.println("name is:"+name);
		System.out.println("salary is:"+salary);
	}
}

class Manager extends employe{
	String department;
	
	public Manager(String manager_department, double empsalary, String empname) {
		super(empsalary, empname);
		this.department =  manager_department;
	}
	
	public void display() {
		super.display();
		System.out.println("department is :"+department);
	}
	
}


public class Employe_manager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager mg = new Manager("A",2000,"deewa");
		mg.display();
	}

}
