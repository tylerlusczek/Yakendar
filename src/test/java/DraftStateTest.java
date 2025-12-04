import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DraftStateTest {

    DraftState ds;
    PostEntity pe;

    @BeforeEach
    public void setUp() throws Exception {
        pe = new PostEntity();
        ds = new DraftState();
    }

    @Test
    public void testEditFunction() {
        assertFalse(ds.edit(pe, null));
    }

    @Test
    public void testPublishFunction() {
        assertTrue(ds.publish(pe));
    }
}
