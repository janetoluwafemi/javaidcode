package tdd;

import java.util.Arrays;

public class StocksOfGoods {
    public boolean stocksOfGoodsInArrayIsEmpty(String input){
        if(input.equalsIgnoreCase("true")){
            return true;
        }
        return false;
    }
    public String elementsInArrayIsEmpty(int[] goodsPrice){
        for(int count = 0; count < goodsPrice.length; count++){
        }
        String result = Arrays.toString(goodsPrice);
            return result;
    }
    public String elementsInArrayIsNull(int[] goodsPrice){
        for(int count = 0; count < goodsPrice.length; count++){
            if(goodsPrice[count] == 0){
                return null;
            }
        }
        return null;
    }
    public String possisibleProfitForSingleStockOfGoods(int[] goodsPrice,int revenue){
        int[] profit = new int[goodsPrice.length];
        for(int count = 0; count < goodsPrice.length; count++){
           if(goodsPrice[count] < revenue){
               profit[count] = revenue - goodsPrice[count];
           }
        }
        String possibleProfit = Arrays.toString(profit);
        return possibleProfit;
    }
    public String possisibleProfitOfGoods(int[] goodsPrice, int revenue){
        int[] profit = new int[goodsPrice.length];
        for(int count = 0; count < goodsPrice.length; count++){
            if(goodsPrice[count] < revenue){
                profit[count] =  revenue - goodsPrice[count];
                profit[count] = goodsPrice[count];

            }
        }
        String possibleProfit = Arrays.toString(profit);
        return possibleProfit;

    }
    public int maximumProfitOfGoods(int[] goodsPrice, int revenue){
        int maximumProfit = 0;
        int[] profit = new int[goodsPrice.length];
        for(int count = 0; count < goodsPrice.length; count++) {
            profit[count] = revenue - goodsPrice[count];
            if (profit[count] > maximumProfit) {
                maximumProfit = profit[count];
            }
        }
        return maximumProfit;
    }
    public String noPoosibleProfitOfGoods(int[] goodsPrice, int revenue){
        int[] noPossibleProfit = new int[goodsPrice.length];
        for(int count = 0; count < goodsPrice.length; count++){
            if(goodsPrice[count] > revenue){
                noPossibleProfit[count] = goodsPrice[count] - revenue;
                noPossibleProfit[count] = goodsPrice[count];
            }
        }
        String nonPossibleProfitInPrice = Arrays.toString(noPossibleProfit);
        return nonPossibleProfitInPrice;
    }
}
