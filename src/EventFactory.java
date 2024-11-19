// EventFactory.java
import java.time.LocalDateTime;

public class EventFactory {

    public static Event createEvent(EventType type, String name, LocalDateTime start, LocalDateTime end, String location) {

        switch (type) {

            case DEADLINE:
                return new Deadline(name, start);

            case MEETING:
                return new Meeting(name, start, end, location);

            default:
                throw new IllegalArgumentException("Unknown event type: " + type);

        }
    }

}