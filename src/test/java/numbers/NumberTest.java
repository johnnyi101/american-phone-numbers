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
    public void print_invalid_if_1st_and_second_value_arent_plus1()
    {
        //arrange
        String input = "-21010101010";
        String expectedResult = "Invalid";
        Number cut = new Number(input);

        //act
        String result = cut.getPhoneNumber();

        //assert
        assertEquals(expectedResult, result);

    }
    @Test
    public void if_input_contains_letters_prints_invalid()
    {
        //arrange
        String input = "+1a010101010";
        String expectedResult = "Invalid";
        Number cut = new Number(input);

        //act
        String result = cut.getPhoneNumber();

        //assert
        assertEquals(expectedResult, result);
    }


}
