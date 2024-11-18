import javax.swing.*;

public class MakingChange {

    public static void main(String[] args) {

        // Create JFrame
        JFrame window = new JFrame("Making Change");
        window.setSize(500, 500);
        window.setVisible(true);

        // Add RegisterPanel to JFrame.
        RegisterPanel registerPanel = new RegisterPanel();
        window.add(registerPanel);

        // Display prompt
        JLabel prompt = new JLabel("Please enter an amount:");
        window.add(prompt);

    }

}
