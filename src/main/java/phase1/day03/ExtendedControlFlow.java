package phase1.day03;

public class ExtendedControlFlow {
    public static void main(String[] args) {

        int responseCode = 404;
        boolean isAuthenticated = false;
        String environment = "production";

        // COMPARISON OPERATORS
        System.out.println(responseCode == 200);   // false — equal to
        System.out.println(responseCode != 200);   // true  — not equal to
        System.out.println(responseCode > 400);    // true  — greater than
        System.out.println(responseCode >= 404);   // true  — greater than or equal
        System.out.println(responseCode < 500);    // true  — less than

        // LOGICAL OPERATORS
        // AND — both conditions must be true
        if (responseCode == 200 && isAuthenticated) {
            System.out.println("Authenticated success");
        }

        // OR — at least one condition must be true
        if (responseCode == 404 || responseCode == 400) {
            System.out.println("Client error");
        }

        // NOT — flips the boolean
        if (!isAuthenticated) {
            System.out.println("User is not authenticated");
        }

        // Combining operators
        if (responseCode >= 500 && environment.equals("production")) {
            System.out.println("CRITICAL: prod is down");
        } else if (responseCode >= 500) {
            System.out.println("Server error in non-prod");
        }
    }
}