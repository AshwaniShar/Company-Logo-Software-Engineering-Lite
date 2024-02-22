import main.java.RewardValue;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RewardValueTests {

    @Test
    public void testGetCashValue() {
        RewardValue rewardValue = new RewardValue(100.0);
        assertEquals(100.0, rewardValue.getCashValue(), 0.001);
    }

    @Test
    public void testGetMilesValue() {
        RewardValue rewardValue = new RewardValue(35000.0, true);
        assertEquals(35000.0, rewardValue.getMilesValue(), 0.001);
    }

    @Test
    public void testConvertCashToMiles() {
        RewardValue rewardValue = new RewardValue(100.0);
        assertEquals(100.0 / 0.0035, rewardValue.getMilesValue(), 0.001);
    }

    @Test
    public void testConvertMilesToCash() {
        RewardValue rewardValue = new RewardValue(35000.0, true);
        assertEquals(35000.0 * 0.0035, rewardValue.getCashValue(), 0.001);
    }
}
