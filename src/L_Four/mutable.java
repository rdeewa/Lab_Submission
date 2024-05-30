package L_Four;

public class mutable {

    private String value;

    public mutable(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void demonstrateValue() {
        // Print the initial value
        System.out.println("Initial Value: " + value);

        // Modify the value to "hello 2"
        setValue("hello 2");
        System.out.println("Updated Value: " + getValue());  

        // Modify the value to "hello 3"
        setValue("hello 3");
        System.out.println("Updated Value: " + getValue()); 
    }

    public static void main(String[] args) {
    	mutable example = new mutable("hello");
        example.demonstrateValue();
    }
}
