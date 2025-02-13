// Create a program to calculate the profit and loss in number and percentage based on the cost price of INR 129 and the selling price of INR 191. 
// Hint => 
// Use a single print statement to display multiline text and variables.
// Profit = selling price - cost price
// Profit Percentage = profit / cost price * 100
// I/P => NONE
// O/P => 
// The Cost Price is INR ___ and Selling Price is INR ___
// The Profit is INR ___ and the Profit Percentage is ___


public class ProfitAndLoss {
    public static void main(String[] args) {
        int costPrice = 129; // The original price of the item
        int sellingPrice = 191; // The price at which the item is sold

        // Calculate the profit by subtracting cost price from selling price
        int profit = sellingPrice - costPrice;

        // Calculate the profit percentage using the formula: (profit / cost price) * 100
        double profitPercentage = profit / (double) costPrice * 100;

        System.out.println("The Cost Price is INR " + costPrice + 
                " and Selling Price is INR " + sellingPrice + "\n" +
                "The Profit is INR " + profit + 
                " and the Profit Percentage is " + profitPercentage);

        System.out.println();
    }
}
