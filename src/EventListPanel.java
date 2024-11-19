// Class imports
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EventListPanel extends JPanel {

    // Create a list of the events that will be displayed.
    ArrayList<Event> events = new ArrayList<>();

    // Create GUI elements for the event list.
    JPanel controlPanel = new JPanel();
    JPanel displayPanel = new JPanel();
    JButton addEventButton = new JButton("Add Event");

    // Constructor
    EventListPanel() {

        // Create layout for JFrame
        setLayout(new BorderLayout());
        controlPanel.setLayout(new FlowLayout());

        // Create sortDropDrown
        String[] sortBy = { "Name (A-Z)", "Name (Z-A)", "Date (Earliest)", " Date (Latest)" };
        JComboBox<String> sortDropDown = new JComboBox<>(sortBy);
        sortDropDown.addActionListener(e -> sort(sortDropDown.getSelectedItem().toString()));
        controlPanel.add(new JLabel("Sort by: "));
        controlPanel.add(sortDropDown);

        // Add the addEvent button.
        addEventButton.addActionListener(e -> addEventModal());
        controlPanel.add(addEventButton);

        // Display control panels.
        add(controlPanel, BorderLayout.SOUTH);
        add(new JScrollPane(displayPanel), BorderLayout.CENTER);

    }

    // Method to add events to the ArrayList
    void addEvent(Event e) {

        events.add(e);
        updateEvents();

    }

    // Method to sort events
    void sort(String sortBy) {

        if (sortBy.equals("Name (A-Z)")) {

            Collections.sort(events);

        }
        else if (sortBy.equals("Name (Z-A)")) {

            Collections.sort(events, Collections.reverseOrder());

        }
        else if (sortBy.equals("Date (Earliest)")) {

            Collections.sort(events, Comparator.comparing(Event::getDateTime));

        }
        else if (sortBy.equals("Date (Latest)")) {

            Collections.sort(events, Collections.reverseOrder(Comparator.comparing(Event::getDateTime)));

        }

        updateEvents();

    }

    // Method to open the add event modal.
    void addEventModal() {

        AddEventModal window = new AddEventModal(this);
        window.setVisible(true);

    }

    // Method to update event display
    void updateEvents() {

        // Remove all elements from displayPanel to start fresh
        displayPanel.removeAll();

        // Add each element of events back into displayPanel
        for (Event e : events) {

            displayPanel.add(new EventPanel(e));

        }

    }

}
