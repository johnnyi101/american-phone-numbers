package numbers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberTest {
    @Test
    public void takes_a_valid_length_number_and_returns_it() {
        //arrange
        String input = "+11010101010";
        String expectedResult = "+11010101010";
        Number cut = new Number(input);

        //act
        String result = cut.getPhoneNumber();

        //assert
        assertEquals(expectedResult, result);

    }

    @Test
    public void test2()
    {

    }


}
