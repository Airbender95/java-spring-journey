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

        // Multiple values in one case
        String typeOfDay = switch (day) {
            case 1, 2, 3, 4, 5 -> "Weekday";
            case 6, 7 -> "Weekend";
            default -> "Invalid";
        };

        System.out.println(typeOfDay); // Weekday

        // Using yield for multi-line cases
        String priority = switch (day) {
            case 1 -> "Low";
            case 2, 3, 4 -> "Medium";
            case 5 -> {
                System.out.println("End of week — wrapping up");
                yield "High";   // yield returns the value from a block
            }
            default -> "Unknown";
        };

        System.out.println(priority);
    }
}