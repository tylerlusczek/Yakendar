import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PublishedStateTest {
    PublishedState ps;
    PostEntity pe;

    @BeforeEach
    public void setUp() throws Exception {
        pe = new PostEntity();
        ps = new PublishedState();
    }

    @Test
    public void testEditFunction() {
        assertFalse(ps.edit(pe, "Hello"));
    }

    @Test
    public void testPublishFunction() {
        assertTrue(ps.publish(pe));
    }

    @Test
    public void testGetIsPublishedIsFalse() {
        assertFalse(ps.getIsPublished());
    }

    @Test
    public void testChangePublishedStatusIsTrue() {
        assertTrue(ps.changePublishedStatus());
    }
}
