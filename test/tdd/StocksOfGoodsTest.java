package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StocksOfGoodsTest {
    @Test
    public void testArrayIsEmpty(){
        StocksOfGoods stocksOfGoods = new StocksOfGoods();
        boolean stockOfGoodsAreEmpty = stocksOfGoods.stocksOfGoodsInArrayIsEmpty("true");
        assertTrue(stockOfGoodsAreEmpty);
    }
    @Test
    public void testASingleElement(){
        StocksOfGoods stocksOfGoods = new StocksOfGoods();
        int[] costOfTheStockOfGoods = [40];
        int revenue = 60;
        String possibleProfitForSingleElement = stocksOfGoods.possisibleProfitForSingleStockOfGoods(costOfTheStockOfGoods,revenue)
    }   assert
    @Test
    public void testPossibleProfitOfTheStockOfGoods() {
        StocksOfGoods stocksOfGoods = new StocksOfGoods();
        int[] costOfTheStockOfGoods = {90,200,300,400,890,600,210,980,290,120};
        int revenue = 500;
        String possiblePriceOfGoods = stocksOfGoods.possisibleProfitOfGoods(costOfTheStockOfGoods,revenue);
        assertEquals("[90, 200, 300, 400, 0, 0, 210, 0, 290, 120]", possiblePriceOfGoods);
    }
    @Test
    public void testMinimumPriceOfTheStockOfGoods() {
        StocksOfGoods stocksOfGoods = new StocksOfGoods();
        int[] costOfTheStockOfGoods = {90,200,300,400,890,600,210,980,290,120};
        int revenue = 500;
        int maximumPriceOfGoods = stocksOfGoods.maximumProfitOfGoods(costOfTheStockOfGoods,revenue);
        assertEquals(410, maximumPriceOfGoods);
    }
    @Test
    public void testNoPossibleProfitOfTheStockOfGoods() {
        StocksOfGoods stocksOfGoods = new StocksOfGoods();
        int[] costOfTheStockOfGoods = {90,200,300,400,890,600,210,980,290,120};
        int revenue = 500;
        String noPossibleProfit = stocksOfGoods.noPoosibleProfitOfGoods(costOfTheStockOfGoods,revenue);
        assertEquals("[0, 0, 0, 0, 890, 600, 0, 980, 0, 0]",noPossibleProfit);

    }
}