package exercise04;

import java.util.Calendar;

/**
 * @author Mike Schmid
 */
public class CurrentTime {

    public int getHour() {
        return Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
    }

}
