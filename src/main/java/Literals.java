public class Literals {
    public static void main(String[] args) {

        /*
        | 1234567890, -3        ––> Integer Literal
        | 1234567890123456789L  ––> Long integer Literal
        | 3.14                  ––> Floating-point number literal (double precision)
        | 2.5f                  ––> Floating-point number literal (single precision)
        | 1e6                   ––> Floating-point number in scientific/exponential notation
        | 'A'                   ––> Character literal
        | "Hello World!"        ––> String literal
        | """                   |
        | Java Rocks!            }  ––> Multi-Line String literal, aka Text-Block
        | Coding is fun"""      |
        | true, false           ––> Boolean literal
        | null                  ––> Null literal
        */
        System.out.println(82937583264L);
        System.out.println(3456.3256542477542);
        System.out.println(-12.2543e-12);
        System.out.println('#');
        System.out.println("Hello World");
        System.out.println("""
                           A
                           B
                           C
                           """);
        System.out.println(false);
        System.out.println(true);

        /*
        | 0b101010  ––> Binary (Base 2) integer literal
        | 052       ––> Octal (Base 8) integer literal
        | 0x2A      ––> Hexadecimal (Base 16) integer literal
        */
        System.out.println(0b11);
        System.out.println(0777);
        System.out.println(0xFF);

        // to make thousands more visible, you can use underlines as separators
        System.out.println(1_000_000_000);
        System.out.println(111.111_111);
        System.out.println(0b11111111_00000000);

    }
}
