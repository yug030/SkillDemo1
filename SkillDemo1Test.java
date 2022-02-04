import static org.junit.Assert.assertEquals;

import java.beans.Transient;

import org.junit.Test;

public class SkillDemo1Test {
    @Test
    public void testRemoveZero(){
        assertEquals(0, SkillDemo1.returnZero());
    }
}
