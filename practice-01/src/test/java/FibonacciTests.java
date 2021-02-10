import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.junit.Assert.*;

public class FibonacciTests {
    private Scanner file;

    @Before
    public void before() throws FileNotFoundException {
        file = new Scanner(new File(getClass().getClassLoader().getResource("fib.txt").getFile()));
    }

    @After
    public void after() {
        file.close();
    }

    @Test
    public void zeroIsZero() {
        assertEquals(0, Fibonacci.withLoop(0));
    }

    @Test
    public void firstIsOne() {
        assertEquals(1, Fibonacci.withLoop(1));
    }

    @Test
    public void negativeParameter() {
        assertEquals(0, Fibonacci.withLoop(-1));
        assertEquals(0, Fibonacci.withLoop(-2));
        assertEquals(0, Fibonacci.withLoop(-22));
        assertEquals(0, Fibonacci.withLoop(-2222));
    }

    @Test
    public void first15() {
        int i = 0;
        while (file.hasNextLine()) {
            int n = file.nextInt();
            assertEquals("Fib n = " + i, n, Fibonacci.withLoop(i));
            i++;
        }
    }
}
