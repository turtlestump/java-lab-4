// EventFactory.java
import java.time.LocalDateTime;

public class EventFactory {

    public static Event createEvent(String type, String name, LocalDateTime start, LocalDateTime end, String location) {

        switch (type) {

            case "Deadline":
                return new Deadline(name, start);

            case "Meeting":
                return new Meeting(name, start, end, location);

            default:
                throw new IllegalArgumentException("Unknown event type: " + type);

        }
    }

}