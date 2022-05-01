import java.beans.Transient;

import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoOneTest {
    @Test
    public void square() {
        assertEquals(1, SkillDemoOne.square(2));
    }
}
