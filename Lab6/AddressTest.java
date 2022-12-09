package Lab6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AddressTest {
    private Address testingAddress;
    private static final String testingStreetName = "Reymonta";
    private static final int testingStreetNumber = 17;
    private static final String testingCode = "30-059";
    private static final String testingCity = "Kraków";
    private static final String testingCountry = "Polska";

    @BeforeEach
    void setUp() {
        testingAddress = new Address(testingStreetName, testingStreetNumber, testingCode, testingCity, testingCountry);
    }

    @Test
    public void constructorTest() {
        assertNotNull(testingAddress);
        assertEquals(testingStreetName, testingAddress.getStreetName());
        assertEquals(testingStreetNumber, testingAddress.getStreetNumber());
        assertEquals(testingCode, testingAddress.getCode());
        assertEquals(testingCity, testingAddress.getCity());
        assertSame(testingCountry, testingAddress.getCountry());
    }

    @Test
    public void lengthTest() {
        Address testingAddress = new Address(testingStreetName, testingStreetNumber, testingCode, testingCity, testingCountry);
        assertTrue(testingStreetName.length() == testingAddress.length("streetName"));
        assertTrue(Integer.toBinaryString(testingStreetNumber).length() == testingAddress.length("streetNumber"));
        assertTrue(testingCode.length() == testingAddress.length("code"));
        assertFalse(testingCity.length() != testingAddress.length("city"));
        assertFalse(testingCountry.length() != testingAddress.length("country"));
        assertFalse(-1 != testingAddress.length(""));
    }
}