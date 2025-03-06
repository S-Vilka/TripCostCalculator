import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TripCalculatorTest {

    @Test
    void testCalculateTripCost() {
        assertEquals(5.0, TripCalculator.calculateTripCost(100, 1.0), 0.01);
        assertEquals(10.0, TripCalculator.calculateTripCost(200, 1.0), 0.01);
        assertEquals(7.5, TripCalculator.calculateTripCost(150, 1.0), 0.01);
        assertEquals(15.0, TripCalculator.calculateTripCost(300, 1.0), 0.01);
        assertEquals(50.0, TripCalculator.calculateTripCost(100, 10.0), 0.01);
    }
}
