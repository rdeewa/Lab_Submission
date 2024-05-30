package L_Four;


class shapes{
	
	public void draw() {
		System.out.println("Drawing Circle");
	}
}

class circle extends shapes{
	public void draw() {
		super.draw();
	}
}

public class shape {

	
	
	public static void main(String[] args) {
		circle cs =  new circle();
		cs.draw();

	}

}
