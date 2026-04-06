package phase1.day03;

public class ControlFlow {
    public static void main(String[] args) {

        int responseCode = 404;

        // Basic if/else
        if (responseCode == 200) {
            System.out.println("Success");
        } else {
            System.out.println("Something went wrong");
        }

        // else if — multiple conditions
        if (responseCode == 200) {
            System.out.println("OK");
        } else if (responseCode == 400) {
            System.out.println(responseCode + ": Bad Request");
        } else if (responseCode == 401) {
            System.out.println(responseCode + ": Unauthorized");
        } else if (responseCode == 404) {
            System.out.println(responseCode + ": Not Found");
        } else if (responseCode == 500) {
            System.out.println(responseCode + ": Internal Server Error");
        } else {
            System.out.println(responseCode + ": Unknown status code");
        }
    }
}