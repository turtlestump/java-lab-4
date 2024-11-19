// Class imports
import java.time.LocalDateTime;

public class Event implements Comparable<Event> {

    // Attributes
    String name;
    LocalDateTime dateTime;

    // Accessors
    String getName() {

        return name;

    }
    LocalDateTime getDateTime() {

        return dateTime;

    }

    // Mutators
    void setName(String name) {

        this.name = name;

    }
    void setDateTime(LocalDateTime dateTime) {

        this.dateTime = dateTime;

    }

    // Comparable implementation
    public int compareTo(Event e) {

        // Determine whether e comes before the current event or after.
        return this.dateTime.compareTo(e.dateTime);

    }

}
