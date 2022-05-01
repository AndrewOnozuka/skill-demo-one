import java.beans.Transient;

import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoOneTest {
    @Test
    public void square1() {
        assertEquals(1, SkillDemoOne.square(1));
    }
    @Test
    public void square2() {
        assertEquals(4, SkillDemoOne.square(2));
    }
}
