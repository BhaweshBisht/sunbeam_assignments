public class NumberConversion {
    public static void main(String[] args) {
        int number = 20;
        System.out.println("Given Number: " + number);
        System.out.println("Binary: " + Integer.toBinaryString(number));
        System.out.println("Octal: " + Integer.toOctalString(number));
        System.out.println("Hexadecimal:" + Integer.toHexString(number).toUpperCase());
    }
}