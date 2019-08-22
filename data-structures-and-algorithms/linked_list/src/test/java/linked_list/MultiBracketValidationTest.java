package linked_list;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiBracketValidationTest {

    @Test
    public void testMultiBracketValidation() {
        String testStr =  "( Fabe)[]";
        String testStr2 = "((Fabe)[]";
        assertTrue("This should return true",MultiBracketValidation.multiBracketValidation(testStr));
        assertFalse("This should return false",MultiBracketValidation.multiBracketValidation(testStr2));
    }
}