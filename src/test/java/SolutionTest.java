import org.junit.Assert;
import org.junit.Test;

/**
 * @author David Yang
 */
public class SolutionTest {

  @Test
  public void shouldReturnMaximizedProfitWhenTheStockGeneratesAPositiveReturn() {
    //given
    Solution solution = new Solution();

    //when
    int[] stockPrices = {10, 7, 5, 8, 11, 9};

    //then
    Assert.assertEquals(6, solution.getMaxProfit(stockPrices));
  }

  @Test
  public void shouldReturnZeroWhenTheStockGeneratesANegativeReturn() {
    //given
    Solution solution = new Solution();

    //when
    int[] stockPrices = {10, 9, 8, 7, 6, 5};

    //then
    Assert.assertEquals(0, solution.getMaxProfit(stockPrices));
  }

  @Test
  public void shouldReturnZeroWhenTheInputArrayIsEmpty() {
    //given
    Solution solution = new Solution();

    //when
    int[] stockPrices = {};

    //then
    Assert.assertEquals(0, solution.getMaxProfit(stockPrices));
  }
}
