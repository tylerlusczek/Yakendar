import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class PostEntityTest {
    PostEntity pe;
    @BeforeEach
    public void setUp() throws Exception {
        pe = new PostEntity();
        pe.setId(1L);
        pe.setLocation("United States");
        pe.setUsername("CoolGuy");
        pe.setContent("Hello World");
    }

    @Test
    public void testEdit() {
        pe.setContent("content");
        assertEquals("content", pe.getContent());
    }

    @Test
    public void testGetContent() {
        assertEquals("Hello World", pe.getContent());
    }

    @Test
    public void testSetContent() {
        pe.setContent("content");
        assertEquals("content", pe.getContent());
    }

    @Test
    public void testPublish() {
        pe.publish();
        assertInstanceOf(PublishedState.class, pe.getState());
    }

    @Test
    public void testSetState() {
        DraftState testState = new DraftState();
        pe.setState(testState);
        assertEquals(testState, pe.getState());
    }

    @Test
    public void testGetState() {
        assertInstanceOf(DraftState.class, pe.getState());
    }

    @Test
    public void testSetId() {
        pe.setId(2L);
        assertEquals(2L, pe.getId());
    }

    @Test
    public void testGetId() {
        assertEquals(1L, pe.getId());
    }

    @Test
    public void testSetUsername() {
        pe.setUsername("CoolGuy2");
        assertEquals("CoolGuy2", pe.getUsername());
    }

    @Test
    public void testGetUsername() {
        assertEquals("CoolGuy", pe.getUsername());
    }

    @Test
    public void testSetLocation() {
        pe.setLocation("United Kingdom");
        assertEquals("United Kingdom", pe.getLocation());
    }

    @Test
    public void testGetLocation() {
        assertEquals("United States", pe.getLocation());
    }

    @Test
    public void testMultipleFunctions() {
        assertInstanceOf(DraftState.class, pe.getState());

        //Change to a published state
        pe.publish();
        assertInstanceOf(PublishedState.class, pe.getState());

        //Check changing the ID
        pe.setId(2L);
        assertEquals(2L, pe.getId());

        pe.setId(1L);
        assertEquals(1L, pe.getId());
    }
}