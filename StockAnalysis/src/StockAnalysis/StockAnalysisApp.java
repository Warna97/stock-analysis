package StockAnalysis;
import java.util.ArrayList;

public class StockAnalysisApp {
	public static float calculateAveragePrice(float[] prices) {
        float sum = 0.0f;
        for (float price : prices) {
            sum += price;
        }
        return sum / prices.length;
    }

    // Task 2: Find the maximum stock price
    public static float findMaximumPrice(float[] prices) {
        float maxPrice = Float.MIN_VALUE;
        for (float price : prices) {
            if (price > maxPrice) {
                maxPrice = price;
            }
        }
        return maxPrice;
    }

    // Task 3: Determine the occurrence count of a specific price
    public static int countOccurrences(float[] prices, float targetPrice) {
        int count = 0;
        for (float price : prices) {
            if (price == targetPrice) {
                count++;
            }
        }
        return count;
    }

    // Task 4: Compute the cumulative sum of stock prices using ArrayList
    public static ArrayList<Float> computeCumulativeSum(ArrayList<Float> prices) {
        ArrayList<Float> cumulativeSum = new ArrayList<>();
        float sum = 0.0f;
        for (float price : prices) {
            sum += price;
            cumulativeSum.add(sum);
        }
        return cumulativeSum;
    }
	public static void main(String[] args) {
		float[] stockPrices = {145.7f, 148.3f, 152.1f, 150.5f, 147.9f, 155.2f, 160.8f, 162.3f, 159.7f, 157.4f};
	    
	    float average = calculateAveragePrice(stockPrices);
	    float maxPrice = findMaximumPrice(stockPrices);
	    int occurrenceCount = countOccurrences(stockPrices, 150.5f);
	    
	    System.out.println("Average Stock Price: " + average);
	    System.out.println("Maximum Stock Price: " + maxPrice);
	    System.out.println("Occurrences of 150.5: " + occurrenceCount);
	    
	    ArrayList<Float> stockPricesList = new ArrayList<>();
	    for (float price : stockPrices) {
	        stockPricesList.add(price);
	    }
	    
	    ArrayList<Float> cumulativeSumList = computeCumulativeSum(stockPricesList);
	    
	    System.out.println("Cumulative Sum of Stock Prices:");
	    for (float sum : cumulativeSumList) {
	        System.out.println(sum);
	    }

	}

}
