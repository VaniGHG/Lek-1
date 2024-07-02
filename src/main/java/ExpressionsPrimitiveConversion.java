public class ExpressionsPrimitiveConversion {
    public static void main(String[] args) {
        /*
        * 1. implicit (automatic) typecasting (widening conversion)
        */

        int intValue = 12;
        long longValue = intValue;      //

        System.out.println(Integer.MAX_VALUE);
        float maxValue = Integer.MAX_VALUE;
        System.out.println(maxValue);

        //

        /*
            2. explicit typecasting (narrowing conversion)
        */

        long value = 1111111L;
        int intVal = (int)(value + value);

        double random = Math.random();      // Math.random == 0.000000000 < 0.99999999999
        System.out.println((int) random);   // always 0
        System.out.println((int) (random * 10));

        System.out.println((int) (Math.random() * 10));
        System.out.println((int) (Math.random() * 10));
        System.out.println((int) (Math.random() * 10));
        System.out.println((int) (Math.random() * 10));
        System.out.println((int) (Math.random() * 10));

        String s = String.valueOf(value);
        System.out.println(s);

    }
}
