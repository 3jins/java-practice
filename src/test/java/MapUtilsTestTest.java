import maputils.SynchronizedMapExample;
import maputils.UnsynchronizedMapExample;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MapUtilsTestTest {

    @Test
    public void testUnsynchronizedMap() { // It fails very often
        int numThreads = 10000;
        UnsynchronizedMapExample unsynchronizedMapExample = new UnsynchronizedMapExample();
        for (int i = 0; i < numThreads; i++) {
            Thread t = new Thread(unsynchronizedMapExample);
            t.start();
            Assertions.assertEquals("apple", unsynchronizedMapExample.getMap().get("red"));
        }
    }

    @Test
    public void testSynchronizedMap() { // It always passes
        int numThreads = 10000;
        SynchronizedMapExample synchronizedMapExample = new SynchronizedMapExample();
        for (int i = 0; i < numThreads; i++) {
            Thread t = new Thread(synchronizedMapExample);
            t.start();
        }
        Assertions.assertEquals("apple", synchronizedMapExample.getMap().get("red"));
    }
}
