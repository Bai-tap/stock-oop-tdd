import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class StockTest {

    @Test
    public void testORCLChangePercent() {
        Stock stock = new Stock("ORCL", "Oracle Corporation");
        stock.previousClosingPrice = 34.5;
        stock.currentPrice = 32.5;
        double expected = -0.02;

        double actual = stock.getChangePercent();
        assertEquals(expected, actual);
    }
}