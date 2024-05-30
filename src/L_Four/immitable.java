package L_Four;

public class immitable {

	    // Declare the field as private and final
	    private final String value;

	    // Constructor 
	    public immitable(String value) {
	        this.value = value;
	    }

	    // Main method for testing
	    public static void main(String[] args) {
	    	immitable example = new immitable("Hi");
	        // Accessing the value directly within the class 
	        System.out.println("Value: " + example.value); 
	    }
	}
