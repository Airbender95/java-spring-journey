package phase1.day03;

public class OldSwitch {
    public static void main(String[] args) {

        // THE OLD WAY — switch statement (Java 8 legacy - changed after Java 14)
        int day = 3;
        String dayName;

        switch (day) {
            case 1:
                dayName = "Monday";
                break;          // Break is necessary
            case 2:
                dayName = "Tuesday";
                break;          // forget this and code "falls through" to next case
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            default:
                dayName = "Weekend";
                break;
        }

        System.out.println(dayName); // Wednesday
    }
}