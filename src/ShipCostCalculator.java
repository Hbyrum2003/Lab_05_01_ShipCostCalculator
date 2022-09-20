public class ShipCostCalculator {
    public static void main(String[] args) {
        double ItemCost;
        double salesTax = 0.02;
        double totalCost;
        ItemCost = 10;
        if (ItemCost >= 100){
            totalCost = ItemCost * salesTax + ItemCost;
            System.out.println("You total price is: $ " + totalCost);
        }else{
            System.out.println("Your total price is: " + ItemCost);
        }
    }
}
