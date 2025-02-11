import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        NumberCheck();
        System.out.println("Task 2");
        NumCheck();
        System.out.println("Task 3");
        liftControl(8, 10);
        liftControl(3, 7);
        liftControl(3, 2);
        System.out.println("Task 4");
        yesOrNo();


    }
    public static void NumberCheck() {
        int n = 60;
        System.out.println("Число " + n + (n > 50 && n < 100 ? " міститься " : " не міститься ") + "в проміжку (50; 100)");
    }
    public static void NumCheck() {
        int b = 753;
        int digit1 = b / 100;
        int digit2 = (b / 10) % 10;
        int digit3 = b % 10;

        int maxDigit = digit1;
        if (digit2 > maxDigit) maxDigit = digit2;
        if (digit3 > maxDigit) maxDigit = digit3;

        System.out.println("Найбільша цифра числа " + b + " - " + maxDigit);

    }

    public static void liftControl(int currentFloor, int targetFloor) {
        if (targetFloor > 9) {
            System.out.println("Ліфт не може піднятися вище 9-го поверху.");
            return;
        }
        if (targetFloor == 2) {
            if (currentFloor < targetFloor) {
                targetFloor = 3;  // Підйом: 2-й поверх замінюється на 3-й
            } else if (currentFloor > targetFloor) {
                targetFloor = 1;  // Спуск: 2-й поверх замінюється на 1-й
            }

            System.out.println("Ліфт доставить вас на " + targetFloor + " поверх.");
        } else if (targetFloor > currentFloor) {
            System.out.println("Ви піднялись на " + targetFloor + " поверх.");
        } else if (targetFloor < currentFloor) {
            System.out.println("Ви спустились на " + targetFloor + " поверх.");
        } else {
            System.out.println("Ви на тому ж поверсі!");
        }
    }

        public static void yesOrNo() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Виберіть опцію:");
            System.out.println("1. Погодитись (Так, ОК, Yes, Y, +, Ok)");
            System.out.println("2. Відмовитись (Ні, NO, N, -, No)");

            String userInput = scanner.nextLine().trim();

            switch (userInput.toLowerCase()) {
                case "так":
                case "ок":
                case "yes":
                case "y":
                case "+":
                case "ok":
                    System.out.println("Я погоджуюсь!");
                    break;

                case "ні":
                case "n":
                case "-":
                case "no":
                    System.out.println("Я відмовляюсь!");
                    break;

                default:
                    System.out.println("Невірний вибір!");
                    break;
            }

            scanner.close();
        }
    }

