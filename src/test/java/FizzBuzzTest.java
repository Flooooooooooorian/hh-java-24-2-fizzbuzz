import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {


    @Test
    public void fizzbuzzWhenIntTwoReturnStringTwo() {
        //GIVEN
        int value = 2;

        //WHEN
        String actual = FizzBuzz.fizzbuzz(value);

        //THEN
        String expected = "2";
        assertEquals(expected, actual);
    }

    @Test
    public void fizzbuzzWhenInt6ReturnStringFizz() {
        //GIVEN
        int value = 6;

        //WHEN
        String actual = FizzBuzz.fizzbuzz(value);

        //THEN
        String expected = "fizz";
        assertEquals(expected, actual);
    }

    @Test
    public void fizzbuzzWhenInt10ReturnStringBuzz() {
        //GIVEN
        int value = 10;

        //WHEN
        String actual = FizzBuzz.fizzbuzz(value);

        //THEN
        String expected = "buzz";
        assertEquals(expected, actual);
    }

    @Test
    public void fizzbuzzWhenInt15ReturnStringFizzBuzz() {
        //GIVEN
        int value = 15;

        //WHEN
        String actual = FizzBuzz.fizzbuzz(value);

        //THEN
        String expected = "fizzbuzz";
        assertEquals(expected, actual);
    }
}
