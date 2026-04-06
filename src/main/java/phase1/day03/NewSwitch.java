package phase1.day03;

public class NewSwitch {
    public static void main(String[] args) {

        // THE NEW WAY — switch expression (Java 14+, default in Java 17)
        int day = 3;

        // Arrow syntax — no break needed, no fall-through possible
        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            default -> "Weekend";
        };

        System.out.println(dayName); // Wednesday
    }
}