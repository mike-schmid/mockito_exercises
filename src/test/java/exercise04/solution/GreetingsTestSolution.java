package exercise04.solution;

import exercise04.CurrentDateTime;
import exercise04.CurrentTime;
import exercise04.Greetings;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

/**
 * Exercise 04 - Mockception
 *
 * @author Mike Schmid
 */
@RunWith(MockitoJUnitRunner.class)
public class GreetingsTestSolution {

    @Mock
    private CurrentDateTime mockCurrentDateTime;

    @Mock
    private CurrentTime mockCurrentTime;

    @Test
    public void testSayHello() throws Exception {
        final Greetings greetings = new Greetings(mockCurrentDateTime);
        when(mockCurrentDateTime.getCurrentTime()).thenReturn(mockCurrentTime);

        when(mockCurrentTime.getHour()).thenReturn(5);
        Assert.assertEquals("Good morning!", greetings.sayHello());

        when(mockCurrentTime.getHour()).thenReturn(15);
        Assert.assertEquals("Good afternoon!", greetings.sayHello());

        when(mockCurrentTime.getHour()).thenReturn(22);
        Assert.assertEquals("Good night!", greetings.sayHello());

        when(mockCurrentTime.getHour()).thenReturn(99);
        Assert.assertEquals("Hi!", greetings.sayHello());

    }

}