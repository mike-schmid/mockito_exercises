package exercise04;

/**
 * @author Mike Schmid
 */
public class Greetings {

    private final CurrentDateTime currentDateTime;

    public Greetings(final CurrentDateTime currentDateTime) {
        this.currentDateTime = currentDateTime;
    }

    public String sayHello() {
        int hour = currentDateTime.getCurrentTime().getHour();

        String greeting;

        if (hour >= 0 && hour < 12) {
            greeting = "Good morning!";
        } else if (hour >= 12 && hour < 21) {
            greeting = "Good afternoon!";
        } else if (hour >= 21 && hour <= 24) {
            greeting = "Good night!";
        } else {
            greeting = "Hi!";
        }

        return greeting;
    }

}
