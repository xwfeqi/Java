public class Main{
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        int division = a / b;
        int remainder = a % b;

        System.out.println(division);
        System.out.println(remainder);
        System.out.println("------------------");

        int num = 53;
        int decimal = num / 10;
        int integer = num % 10;
        int sum = decimal + integer;

        System.out.println(num);
        System.out.println(sum);
        System.out.println("------------------");

        double number = 3.14;
        long roundedNumber = Math.round(number);

        System.out.println(number);
        System.out.println(roundedNumber);


    }
}