// Class imports
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventPanel extends JPanel {

    // Create Event object.
    Event event = new Event();

    // Create complete action.
    JButton completeButton = new JButton("Complete");

    // Constructor
    EventPanel(Event event) {

        this.event = event;

        // These JLabels will hold the event's name and date, respectively
        JLabel eventName = new JLabel(event.getName());
        JLabel eventDate = new JLabel(event.getDateTime().toString());

        add(eventName);
        add(eventDate);

        // Check if the event can be completed
        if (event instanceof Completable) {

            // Add complete button
            completeButton.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {

                    ((Completable) event).complete();

                }

            });

            add(completeButton);

            // Show whether the event is complete.
            displayCompletion();

        }

    }

    // This method will display whether an event has been completed.
    void displayCompletion() {

        if (((Completable)event).isComplete()) {

            JLabel eventCompleted = new JLabel("Complete");
            add(eventCompleted);

        }

    }

}
