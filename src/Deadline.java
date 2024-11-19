import java.time.LocalDateTime;

public class Deadline extends Event implements Completable {

    // Attributes
    boolean complete;

    // Constructor
    public Deadline(String name, LocalDateTime dateTime) {

        this.name = name;
        this.dateTime = dateTime;

    }

    // Completable implementation
    public void complete() {

        complete = true;

    }
    public boolean isComplete() {

        return complete;

    }

}
