// Class imports
import java.time.*;

public class Meeting extends Event implements Completable {

    // Attributes
    LocalDateTime endDateTime;
    String location;
    boolean complete;

    // Constructor
    public Meeting(String name, LocalDateTime start, LocalDateTime end, String location) {

        this.name = name;
        this.dateTime = start;
        this.endDateTime = end;
        this.location = location;

    }

    // Accessors
    LocalDateTime getEndDateTime() {

        return endDateTime;

    }
    String getLocation() {

        return location;

    }

    // Mutators
    void setEndDateTime(LocalDateTime end) {

        this.endDateTime = end;

    }
    void setLocation(String location) {

        this.location = location;

    }

    // Other methods
    Duration getDuration() {

        return Duration.between(dateTime, endDateTime);

    }

    // Completable implementation
    public void complete() {

        complete = true;

    }
    public boolean isComplete() {

        return complete;

    }

}
