package phase1.day02;

public class CastingDemo {
    public static void main(String[] args) {

        // WIDENING — automatic, no data loss
        int myInt = 100;
        long myLong = myInt;      // int fits inside long, Java does this automatically
        double myDouble = myInt;  // int fits inside double, automatic

        System.out.println(myLong);   // 100
        System.out.println(myDouble); // 100.0

        // NARROWING — manual cast required, potential data loss
        double price = 19.99;
        int truncated = (int) price;  // explicitly cast — you're telling Java "I know what I'm doing"
        System.out.println(truncated); // 19 — decimal is DROPPED, not rounded

        // String to int — common in real code (parsing API responses, configs)
        String numberAsString = "42";
        int parsed = Integer.parseInt(numberAsString);
        System.out.println(parsed + 8); // 50 — now it's a real int

        // int to String — also common
        int id = 12345;
        String idAsString = String.valueOf(id);
        System.out.println("ID: " + idAsString); // ID: 12345
    }
}