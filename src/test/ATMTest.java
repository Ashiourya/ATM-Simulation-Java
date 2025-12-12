import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ATMTest {
    private ATM atm;

    @BeforeEach
    public void setUp() {
        atm = new ATM();
    }

    @Test
    public void testValidateUser() {
        assertTrue(atm.validateUser("123456", "1234")); // Replace with valid test data
        assertFalse(atm.validateUser("wrongAcc", "wrongPin"));
    }

    @Test
    public void testGetBalance() {
        double balance = atm.getBalance("123456"); // Replace with valid test data
        assertEquals(1000.0, balance); // Replace with expected balance
    }

    @Test
    public void testDeposit() {
        atm.deposit("123456", 500.0); // Replace with valid test data
        assertEquals(1500.0, atm.getBalance("123456")); // Replace with expected balance after deposit
    }
}