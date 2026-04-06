package phase1.day03;

public class SwitchDemo {
    public static void main(String[] args) {

        int statusCode = 404;

        String message = switch (statusCode) {
            case 200 -> "OK";
            case 201 -> "Created";
            case 400 -> "Bad Request";
            case 401 -> "Unauthorized";
            case 403 -> "Forbidden";
            case 404 -> "Not Found";
            case 500 -> "Internal Server Error";
            default -> "Unknown status: " + statusCode;
        };

        System.out.println(message); // Not Found
    }
}