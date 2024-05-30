package L_Four;

public class Cal_add_M {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    
    public static void main(String[] args) {
    	Cal_add_M calc = new Cal_add_M();

        // Adding two integers
        int sumInt = calc.add(5, 10);
        System.out.println("Sum of integers: " + sumInt);

        // Adding two doubles
        double sumDouble = calc.add(3.5, 2.5);
        System.out.println("Sum of doubles: " + sumDouble);

        // Adding three integers
        int sumThreeInt = calc.add(2, 4, 6);
        System.out.println("Sum of three integers: " + sumThreeInt);

       
    }
}
