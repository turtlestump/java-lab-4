// Class imports
import javax.swing.*;
import java.awt.*;

public class PursePanel extends JPanel {

    // This method will display the purse's contents.
    public void paintComponent(Graphics g, Purse purse) {

        // This variable will be used to set the y-coordinate of each unit of currency
        int y;

        // Display each bill / coin.
        for (int i = 0; i < purse.cash.get(Register.oneHundredNote); i++) {

            y = 10;
            g.drawImage(new ImageIcon(Register.oneHundredNote.img()).getImage(), 10, y, null);
            y += 10;

        }

        for (int i = 0; i < purse.cash.get(Register.fiftyNote); i++) {

            y = 10;
            g.drawImage(new ImageIcon(Register.fiftyNote.img()).getImage(), 10, y, null);
            y += 10;

        }

        for (int i = 0; i < purse.cash.get(Register.twentyNote); i++) {

            y = 10;
            g.drawImage(new ImageIcon(Register.twentyNote.img()).getImage(), 10, y, null);
            y += 10;

        }

        for (int i = 0; i < purse.cash.get(Register.tenNote); i++) {

            y = 10;
            g.drawImage(new ImageIcon(Register.tenNote.img()).getImage(), 10, y, null);
            y += 10;

        }

        for (int i = 0; i < purse.cash.get(Register.fiveNote); i++) {

            y = 10;
            g.drawImage(new ImageIcon(Register.fiveNote.img()).getImage(), 10, y, null);
            y += 10;

        }

        for (int i = 0; i < purse.cash.get(Register.oneNote); i++) {

            y = 10;
            g.drawImage(new ImageIcon(Register.oneNote.img()).getImage(), 10, y, null);
            y += 10;

        }

        for (int i = 0; i < purse.cash.get(Register.quarter); i++) {

            y = 10;
            g.drawImage(new ImageIcon(Register.quarter.img()).getImage(), 10, y, null);
            y += 10;

        }

        for (int i = 0; i < purse.cash.get(Register.dime); i++) {

            y = 10;
            g.drawImage(new ImageIcon(Register.dime.img()).getImage(), 10, y, null);
            y += 10;

        }

        for (int i = 0; i < purse.cash.get(Register.nickel); i++) {

            y = 10;
            g.drawImage(new ImageIcon(Register.nickel.img()).getImage(), 10, y, null);
            y += 10;

        }

        for (int i = 0; i < purse.cash.get(Register.penny); i++) {

            y = 10;
            g.drawImage(new ImageIcon(Register.penny.img()).getImage(), 10, y, null);
            y += 10;

        }

    }

}
