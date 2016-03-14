import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GuesserTest {

    @Test
    public void newGuesser() {
	Guesser g = new Guesser(0,10);
    
	assertEquals(0, g.lower);
	assertEquals(10, g.upper);
    }

    @Test
    public void setLowerToOne() {
	Guesser g = new Guesser(0,10);
	g.setLower(1);
    
	assertEquals(1, g.lower);
	assertEquals(10, g.upper);
    }