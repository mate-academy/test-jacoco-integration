package core.basesyntax;

import org.junit.Assert;
import org.junit.Test;

/**
 * Feel free to remove this class and create your own.
 */
public class StringManagerTest {
    StringManager stringManager = new StringManager();
    @Test
    public void toUpper_Null() {
        String s = null;
        Assert.assertNull(stringManager.toUpper(s));
    }
}
