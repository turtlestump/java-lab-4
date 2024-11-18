// Class imports
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Register {

    // Create denominations.
    static Denomination oneHundredNote = new Denomination("One Hundred Note", 100.00, "bill", "hundred_note.png");
    static Denomination fiftyNote = new Denomination("Fifty Note", 50.00, "bill", "fifty_note.png");
    static Denomination twentyNote = new Denomination("Twenty Note", 20.00, "bill", "twenty_note.png");
    static Denomination tenNote = new Denomination("Ten Note", 10.00, "bill", "ten_note.png");
    static Denomination fiveNote = new Denomination("Five Note", 5.00, "bill", "five_note.png");
    static Denomination oneNote = new Denomination("One Note", 1.00, "bill", "one_note.png");
    static Denomination quarter = new Denomination("Quarter", 0.25, "coin", "quarter.png");
    static Denomination dime = new Denomination("Dime", 0.10, "coin", "dime.png");
    static Denomination nickel = new Denomination("Nickel", 0.05, "coin", "nickel.png");
    static Denomination penny = new Denomination("Penny", 0.01, "coin", "penny.png");

    Purse makeChange(double amt) {

        // Create hashmap for purse contents.
        Map<Denomination, Integer> cash = new HashMap<>();

        // Create Purse object.
        Purse purse = new Purse();

        // This variable will store the total amount of cents in amt.
        int cents = (int) (amt * 100);

        /* Quick note for review: Tried to use enhanced for-loop, but was unsuccessful because of the unordered nature
                                  of HashMaps; would a LinkedHashMap be necessary?                                    */

        // Determine number of notes and bills for each denomination
        if (cents / 10000.00 > 0) {

            // Calculate number of one-hundred notes.
            int oneHundredNotes = cents / 10000;
            cents -= oneHundredNotes * 10000;

            cash.put(oneHundredNote, oneHundredNotes);

        }

        if (cents / 5000.00 > 0) {

            // Calculate number of fifty notes.
            int fiftyNotes = cents / 5000;
            cents -= fiftyNotes * 5000;

            cash.put(fiftyNote, fiftyNotes);

        }

        if (cents / 2000.00 > 0) {

            // Calculate number of twenty notes.
            int twentyNotes = cents / 2000;
            cents -= twentyNotes * 2000;

            cash.put(twentyNote, twentyNotes);

        }

        if (cents / 1000.00 > 0) {

            // Calculate number of ten notes.
            int tenNotes = cents / 1000;
            cents -= tenNotes * 1000;

            cash.put(tenNote, tenNotes);

        }

        if (cents / 500.00 > 0) {

            // Calculate number of five notes.
            int fiveNotes = cents / 500;
            cents -= fiveNotes * 500;

            cash.put(fiveNote, fiveNotes);

        }

        if (cents / 100.00 > 0) {

            // Calculate number of one notes.
            int oneNotes = cents / 100;
            cents -= oneNotes * 100;

            cash.put(oneNote, oneNotes);

        }

        if (cents / 25.00 > 0) {

            // Calculate number of quarters.
            int quarters = cents / 25;
            cents -= quarters * 25;

            cash.put(quarter, quarters);

        }

        if (cents / 10.00 > 0) {

            // Calculate number of dimes.
            int dimes = cents / 10;
            cents -= dimes * 10;

            cash.put(dime, dimes);

        }

        if (cents / 5.00 > 0) {

            // Calculate number of nickels.
            int nickels = cents / 5;
            cents -= nickels * 5;

            cash.put(nickel, nickels);

        }

        if (cents > 0) {

            cash.put(penny, cents);

        }

        // Set purse's cash attribute.
        purse.cash.putAll(cash);

        return purse;

    }

    // Main method
    static void main (String[] args) {

        // Create Scanner
        Scanner sc = new Scanner(System.in);

        // Create Register and Purse objects.
        Register register = new Register();

        double amt = 0.0;
        boolean isEmpty = true;

        // Ask for an amount and list the minimum amount of bills and coins to reach it.
        System.out.println("Please enter an amount of currency: ");
        amt = sc.nextDouble();

        // Create a purse using the makeChange method.
        Purse purse = register.makeChange(amt);

        // List purse.cash entries in order.
        if (purse.cash.get(oneHundredNote) > 0) {

            System.out.println(purse.cash.get(oneHundredNote) + " One-Hundred Notes");
            isEmpty = false;

        }

        if (purse.cash.get(fiftyNote) > 0) {

            System.out.println(purse.cash.get(fiftyNote) + " Fifty Note");
            isEmpty = false;

        }

        if (purse.cash.get(twentyNote) > 0) {

            System.out.println(purse.cash.get(twentyNote) + " Twenty Notes");
            isEmpty = false;

        }

        if (purse.cash.get(tenNote) > 0) {

            System.out.println(purse.cash.get(tenNote) + " Ten Notes");
            isEmpty = false;

        }

        if (purse.cash.get(fiveNote) > 0) {

            System.out.println(purse.cash.get(fiveNote) + " Five Notes");
            isEmpty = false;

        }

        if (purse.cash.get(oneNote) > 0) {

            System.out.println(purse.cash.get(oneNote) + " One Notes");
            isEmpty = false;

        }

        if (purse.cash.get(quarter) > 0) {

            System.out.println(purse.cash.get(quarter) + " Quarters");
            isEmpty = false;

        }

        if (purse.cash.get(dime) > 0) {

            System.out.println(purse.cash.get(dime) + " Dimes");
            isEmpty = false;

        }

        if (purse.cash.get(nickel) > 0) {

            System.out.println(purse.cash.get(nickel) + " Nickels");
            isEmpty = false;

        }

        if (purse.cash.get(penny) > 0) {

            System.out.println(purse.cash.get(penny) + " Pennies");
            isEmpty = false;

        }

        if (isEmpty) {

            System.out.println("Empty Purse");

        }

    }

}