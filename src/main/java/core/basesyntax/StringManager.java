package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class StringManager {
    public String toUpper(String s) {
        if (s == null) {
            return null;
        }
        if (s.equals("toLower")) {
            return s.toLowerCase();
        }
        return s.toUpperCase();

    }
}
