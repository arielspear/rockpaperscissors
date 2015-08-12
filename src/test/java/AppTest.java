import org.junit.*;
import static org.junit.Assert.*;

public class AppTest {


    @Test
    public void checkWinner_rockBeatsScissors_true() {
        App testApp = new App();
        assertEquals(true, testApp.checkWinner("Rock", "Scissors"));

    }
}
