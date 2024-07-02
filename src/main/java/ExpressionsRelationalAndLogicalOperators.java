public class ExpressionsRelationalAndLogicalOperators {
    public static void main(String[] args) {

        /*
            == Equality
            != Inequality
            > Greater than
            < less than
            >= Greater than or equal to
            <= Less than or equal to
        */

        int a = 12;
        int b = 120;
        boolean result = a < b;
        System.out.println(result);
        System.out.println(a < b);

        /*
            Logical Operators:

            !   Logical NOT
            &&  Logical AND
            ||  Logical Or
            ^   Logical XOR (exclusive OR)
        */

        boolean bool = true;
        System.out.println(!bool);

        int calories = 200;
        // 10 .. 100
        boolean isHealthy = calories > 10 && calories <100;
        System.out.println(isHealthy); // false

        /*
            Short-circuit evaluation
        */

        System.out.println(true && false && true); // true && false ~~~&& true~~~
        System.out.println(true && false && value());
        System.out.println(false && true && value());

        System.out.println(true || false || true);
        System.out.println(true || false || value());

        /*
            Non-Short-circuit evaluation
        */

        System.out.println(true & false & true);
        System.out.println(true & false & value());
        System.out.println(false & true & value());

        System.out.println(true | false | true);
        System.out.println(true | false | value());

    }

    static boolean value() {
        System.out.println("value()");
        return true;
    }
}
