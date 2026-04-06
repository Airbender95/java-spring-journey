package phase1.day02;


public class VarDemo {
    public static void main(String[] args) {

        // Without var — explicit types
        String name1 = "Sushub";
        int count1 = 42;

        // With var — compiler infers the type
        var name2 = "Sushub";    // compiler knows this is a String
        var count2 = 42;         // compiler knows this is an int
        var price = 19.99;       // compiler knows this is a double
        var isActive = true;     // compiler knows this is a boolean

        System.out.println(name2.toUpperCase()); // works — it IS a String
        System.out.println(count2 + 8);          // works — it IS an int
    }
}