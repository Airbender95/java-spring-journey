package phase1.day02;

public class DataTypes {
    public static void main(String[] args) {

        // INTEGER TYPES
        int age = 28;                  // whole numbers, most common (-2.1B to 2.1B)
        long population = 8100000000L; // bigger whole numbers, note the L suffix
        byte smallNum = 100;           // tiny numbers (-128 to 127), rarely used
        short medNum = 30000;          // small numbers, rarely used

        // DECIMAL TYPES
        double price = 19.99;          // decimals, most common (15-16 sig digits)
        float tax = 0.08f;             // less precise decimals, note the f suffix

        // OTHER
        boolean isActive = true;       // true or false, nothing else
        char grade = 'A';              // single character, uses single quotes

        // Print them all
        System.out.println("Age: " + age);
        System.out.println("Population: " + population);
        System.out.println("Price: " + price);
        System.out.println("Is Active: " + isActive);
        System.out.println("Grade: " + grade);

        dataOperations();
    }

    static void dataOperations(){
        // STRINGS — reference type, not a primitive
        String name = "Sushub";
        String role = "Engineer";
        String company = "SF";

        // String concatenation with +
        System.out.println(name + " works as an " + role + " at " + company);

        // String methods — some of the most useful
        System.out.println(name.length());           // 6
        System.out.println(name.toUpperCase());      // SUSHUB
        System.out.println(role.contains("Eng"));    // true
        System.out.println("  hello  ".strip());     // "hello" — strips whitespace
        System.out.println("hello".repeat(3));       // hellohellohello
    }
}