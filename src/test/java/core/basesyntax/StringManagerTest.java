package core.basesyntax;

import org.junit.Assert;
import org.junit.Test;

public class StringManagerTest {
    StringManager stringManager = new StringManager();
    @Test
    public void toUpper_Null() {
        String s = null;
        Assert.assertNull(stringManager.toUpper(s));
    }

    @Test
    public void toUpper_Lower() {
        String s = "toLower";
        Assert.assertEquals("tolower", stringManager.toUpper(s));
    }

    @Test
    public void toUpper_usualCase() {
        String s = "heLLo";
        Assert.assertEquals("HELLO", stringManager.toUpper(s));
    }
}
