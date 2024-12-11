import java.util.Scanner;

public class IT24103907Lab5Q3 {
   
    private static final int ROOM_CHARGE_PER_DAY = 48000;
    private static final int DISCOUNT_3_4_DAYS = 10; 
    private static final int DISCOUNT_5_OR_MORE_DAYS = 20; 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter start date (1-31): ");
        int startDate = scanner.nextInt();

        System.out.print("Enter end date (1-31): ");
        int endDate = scanner.nextInt();

       
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Start date and end date must be between 1 and 31.");
            return; 
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than the end date.");
            return;         }

        int daysReserved = endDate - startDate;

        int discount;
        if (daysReserved < 3) {
            discount = 0; 
        } else if (daysReserved <= 4) {
            discount = DISCOUNT_3_4_DAYS;
        } else {
            discount = DISCOUNT_5_OR_MORE_DAYS;
        }

        int totalAmount = daysReserved * ROOM_CHARGE_PER_DAY;
        double discountedAmount = totalAmount * (1 - discount / 100.0);

        
        System.out.println("Number of days reserved: " + daysReserved);
        System.out.println("Total amount (before discount): Rs. " + totalAmount);
        System.out.println("Discount applied: " + discount + "%");
        System.out.println("Total amount (after discount): Rs. " + discountedAmount);

        scanner.close();
    }
}