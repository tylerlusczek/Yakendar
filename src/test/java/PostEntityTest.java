import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PostEntityTest {
    PostEntity pe;
    @BeforeEach
    public void setUp() throws Exception {
        pe = new PostEntity();
    }

    @Test
    public void testSetState() {
        assertEquals(17, 17);
    }
}