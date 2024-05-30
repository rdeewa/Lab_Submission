package L_Four;

public class StringMethods {

    public static void main(String[] args) {
        String sample = "Hello guys, I am rdeewa";
        
        // remove extra spaces
        String trimmed = sample.trim();
        System.out.println("trim: \"" + trimmed + "\"");

        // This method replaces character occurrences with a particular new character.
        String replaced = sample.replace('s', 'e');
        System.out.println("replace: " + replaced);
        System.out.println();

        // Returns true if this string contains the specified sequence of char values.
        boolean contains = sample.contains("deewa");
        System.out.println("contains: " + contains);
        System.out.println();
        
        // charAt give index value
        String str = "Java";
        System.out.println(str.charAt(2));
        System.out.println();

        //  Replaces each substring of this string that matches the given regular expression with the given replacement.
        String replaceAll = sample.replaceAll("guys", "bro");
        System.out.println("replaceAll: " + replaceAll);
        System.out.println();

        // Returns the index of the first specified substring appearance within a string.
        int indexOf = sample.indexOf('W');
        System.out.println("indexOf: " + indexOf);
        System.out.println();

        // The substring() method returns a section of the string. Two substring methods are 
        String substring = sample.substring(6, 11);
        System.out.println("substring: " + substring);
        System.out.println();

        // Compares this string to the specified object.
        boolean equals = sample.equals("Hello World! Welcome to Java programming.");
        System.out.println("equals: " + equals);
        System.out.println();

        // Returns the index within this string of the last occurrence of the specified character.
        int lastIndexOf = sample.lastIndexOf('o');
        System.out.println("lastIndexOf: " + lastIndexOf);
        System.out.println();

        /* The method tests whether a string starts with a particular prefix. If the string character chain of the argument
        isaprefix of the string character chain, a true value is the output. If not, the value is false.*/
        boolean startsWith = sample.startsWith("Hello");
        System.out.println("startsWith: " + startsWith);
        System.out.println();

        // Tests if this string ends with the specified suffix
        boolean endsWith = sample.endsWith("programming.");
        System.out.println("endsWith: " + endsWith);
        System.out.println();

        // EqualsIgnoreCase() performs a comparison of two strings, It ignores case differences. 
        boolean equalsIgnoreCase = sample.equalsIgnoreCase("hello world! welcome to java programming.");
        System.out.println("equalsIgnoreCase: " + equalsIgnoreCase);
        System.out.println();

        // This method returns the string in lowercase. It converts all string characters into lower case letters.
        String toLowerCase = sample.toLowerCase();
        System.out.println("toLowerCase: " + toLowerCase);
        System.out.println();

        // Converts all string characters to uppercase using default locale rules.
        String toUpperCase = sample.toUpperCase();
        System.out.println("toUpperCase: " + toUpperCase);
        System.out.println();

        // Returns true if, and only if, length() is 0.
        boolean isEmpty = sample.isEmpty();
        System.out.println("isEmpty: " + isEmpty);
        System.out.println();

        // The length() function of a string class returns the length of the string.
        int length = sample.length();
        System.out.println("length: " + length);
        System.out.println();

        // The split method splits a string based on the provided expression. It returns a string array.
        String[] split = sample.split(" ");
        System.out.println("split: ");
        for (String part : split) {
            System.out.println(part);
        }
    }
}

