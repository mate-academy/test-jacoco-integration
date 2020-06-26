package core.basesyntax;

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
