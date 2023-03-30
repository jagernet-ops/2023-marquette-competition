import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LargestNumberTest {

    // Two test cases are provided for you. You may use them as a template to add additional test
    // methods to this class.

    @Test
    public void testFormLargestNumber() throws Exception {
        assertEquals(83141, LargestNumber.formLargestNumber(new int[] {8, 3, 1, 14}));
    }
    
    @Test
    public void testFormLargestNumber2() throws Exception {
        assertNotEquals(14831, LargestNumber.formLargestNumber(new int[] {8, 3, 1, 14}));
    }

    // TODO: Add test cases that prove your understanding of fringe (or unusual) combinations of numbers
    // that show you've thought about different ways to test the program.

}