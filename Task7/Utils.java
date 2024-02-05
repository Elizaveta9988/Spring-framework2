package Task7;

public class Utils {
    public static ResponseEntity<String> getResponseEntity(String message, HttpStatus httpStatus) {
        return new ResponseEntity<>("Message: " + message, httpStatus);
    }
}