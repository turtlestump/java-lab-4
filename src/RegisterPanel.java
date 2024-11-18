// Class imports
import javax.swing.*;
import java.awt.event.*;

public class RegisterPanel extends JPanel {

    // Create necessary objects
    Register register = new Register();
    JPanel inputPanel = new JPanel();
    JTextField input = new JTextField(20);
    PursePanel changePanel = new PursePanel();

    // Create ActionListener for the text field.
    class InputListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            // Clear changePanel.
            changePanel.removeAll();

            // Create purse.
            Purse purse = register.makeChange(Integer.parseInt(input.getText()));

            // Display images to changePanel.
            changePanel.paintComponent(getGraphics(), purse);

        }

    }

}