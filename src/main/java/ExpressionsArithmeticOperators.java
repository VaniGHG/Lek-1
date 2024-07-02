import java.util.function.DoubleToIntFunction;

public class ExpressionsArithmeticOperators {
    public static void main(String[] args) {

        // price of the sweets
        double priceOfChocolate = 1.50;
        double priceOfLicorice = 2.00;

        // Quantity of sweets bought
        int quantityOfChocolate = 3;
        int quantityOfLicorice = 2;

        /*
        * Arithmetic Operators:
        *
        *   + Addition
        *   - Subtraction
        *   / Division
        *   % Modulo (Reminder of a division) a % b = a - (b * floor(a/b))
        */

        // Multiplication: Total cost of the chocolate
        double totalCostOfChocolate = priceOfChocolate * quantityOfChocolate;
        System.out.print("The price of all chocolates together is ");
        System.out.print(totalCostOfChocolate);
        System.out.println(" $");

        // Addition: Total cost of all purchased sweets
        double totalCost = totalCostOfChocolate + priceOfLicorice * quantityOfLicorice;
        //                                        ---------------- 1 -----------------
        System.out.print("The total is ");
        System.out.print(totalCost);
        System.out.println(" $");


        // Subtraction: Remaining money after buying chocolate
        double budget = 10;
        System.out.print("The budget after buying is ");
        System.out.print(budget - totalCost);
        System.out.println(" $");

        // Division: Average cost per item
        int totalItems = quantityOfChocolate + quantityOfLicorice;
        System.out.print("One Item is worth ");
        System.out.print(totalCost / totalItems);
        System.out.println(" $");

        // Reminder

        System.out.println(20 / 6); // 3
        System.out.println(20 % 6); // 2        20 - 6 * 3
        System.out.println(20 / 2); // 10
        System.out.println(20 % 2); // 0

        //

        double totalMinutes = 125.33;
        System.out.println(Math.floor(totalMinutes / 60));
        System.out.println(totalMinutes % 60);

        /*
        * Rule: The modulo operator in Java has the same sign as the dividend (the first number).
        */
        System.out.println(+10 % +3); // 1
        System.out.println(-10 % +3); // -1
        System.out.println(+10 % -3); // 1
        System.out.println(-10 % -3); // -1
        System.out.println(-10 / -3); // 3

        /*
        * Automatic Type Promotion
        */

        double a = 111.111;
        int b = 200;
        System.out.println(a * b);      // ––> double

        char c = 'C';
        // char d = c + 1;
        //          -int-

        /*
        * Grouping:
        *
        * ()
        */

        System.out.println(1 + 1 * 10);     // 11
        System.out.println(1 + (1 * 10));   // 11
        System.out.println((1 + 1) * 10);   // 20

    }
}
