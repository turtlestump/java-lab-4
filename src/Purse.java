// Class imports
import java.util.HashMap;
import java.util.Map;

// Create record for cash denominations.
record Denomination (String name, double amt, String form, String img) { }

public class Purse {

    // Attributes
    Map<Denomination, Integer> cash = new HashMap<>();

    // Accessors / Mutators
    double getValue() {

        double total = 0.0;

        // Iterate through cash to get the value of each denomination.
        for (Map.Entry<Denomination, Integer> entry : cash.entrySet()) {

            total += entry.getValue() * entry.getKey().amt();

        }

        return total;

    }

    void add(Denomination type, int num) {

        cash.put(type, num);

    }

    double remove (Denomination type, int num) {

        // Remove num of type from cash.
        cash.remove(type, num);

        // Return amount removed.
        return (num * type.amt());

    }

    // Other methods
    public String toString() {

        String contents = "";

        // Iterate through cash to print the quantity of each denomination.
        for (Map.Entry<Denomination, Integer> entry : cash.entrySet()) {

            contents = contents + entry.getValue() + " " + entry.getKey().name() + "\n";

        }

        return contents;

    }

}