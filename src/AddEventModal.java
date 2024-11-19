// Class imports
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;

// Method imports
import static java.lang.Integer.parseInt;

public class AddEventModal extends JDialog {

    // Attributes
    EventListPanel eventList;

    // Constructor
    AddEventModal(EventListPanel eventList) {

        this.eventList = eventList;

        // Set window display information
        setTitle("Add Event");
        setSize(400, 400);
        setLayout(new GridLayout(5, 2));

        // User-defined event information
        JLabel eventName = new JLabel("Event Name: ");              // Name
        JTextField nameField = new JTextField();
        add(eventName);
        add(nameField);

        JLabel eventMonth = new JLabel("Event Month: ");              // Date
        JTextField monthField = new JTextField();
        add(eventMonth);
        add(monthField);
        JLabel eventDay = new JLabel("Event Day: ");
        JTextField dayField = new JTextField();
        add(eventDay);
        add(dayField);
        JLabel eventYear = new JLabel("Event Year: ");
        JTextField yearField = new JTextField();
        add(eventYear);
        add(yearField);

        JLabel eventHour = new JLabel("Event Hour: ");              // Time
        JTextField hourField = new JTextField();
        add(eventHour);
        add(hourField);
        JLabel eventMinute = new JLabel("Event Minute: ");
        JTextField minuteField = new JTextField();
        add(eventMinute);
        add(minuteField);
        JLabel eventDuration = new JLabel("Event Duration (Minutes): ");
        JTextField durationField = new JTextField();
        add(eventDuration);
        add(durationField);

        JLabel eventLocation = new JLabel("Event Location: ");      // Location
        JTextField locationField = new JTextField();
        add(eventLocation);
        add(locationField);

        // Select event type
        JLabel eventType = new JLabel("Event Type: ");
        String[] eventTypes = {"Meeting", "Deadline"};
        JComboBox<String> eventTypeSelection = new JComboBox<>(eventTypes);
        add(eventType);

        // Add confirm button
        JButton confirmButton = new JButton("Confirm");
        confirmButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                String name = nameField.getText();
                LocalDateTime dateTime = LocalDateTime.of(parseInt(yearField.getText()),
                        parseInt(monthField.getText()),
                        parseInt(dayField.getText()),
                        parseInt(hourField.getText()),
                        parseInt(minuteField.getText()));

                // Determine event type
                if (eventTypeSelection.getSelectedItem().equals("Meeting")) {

                    Meeting meeting = new Meeting(name, dateTime, dateTime.plusMinutes(parseInt(durationField.getText())), locationField.getText());
                    eventList.addEvent(meeting);

                }
                else if (eventTypeSelection.getSelectedItem().equals("Deadline")) {

                    Deadline deadline = new Deadline(name, dateTime);
                    eventList.addEvent(deadline);

                }

            }

        });

        add(confirmButton);

    }

}
