package test;

// packages
import main.BalancedBrackets;
// Testing functionality
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void oneBracketsReturnsFalse(){ assertFalse(BalancedBrackets.hasBalancedBrackets("["));}

}
