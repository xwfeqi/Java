public class Main {
    public static void main(String[] args) {
        System.out.println("Завдання 1: For loop");
        for (int i = 500; i <= 650; i += 10) {
            System.out.print(i + " ");
        }
        System.out.println("\nWhile loop");
        int i = 500;
        while (i <= 650) {
            System.out.print(i + " ");
            i += 10;
        }
        System.out.println("\nDo-While loop");
        i = 500;
        do {
            System.out.print(i + " ");
            i += 10;
        } while (i <= 650);

        System.out.println("\n\nЗавдання 2: Послідовність 2a - 1");
        int a = 2;
        while (a < 5000) {
            System.out.print(a + " ");
            a = 2 * a - 1;
        }

        System.out.println("\n\nЗавдання 3: Дільники числа 10");
        int num = 10;
        for (int j = 1; j <= num; j++) {
            if (num % j == 0) {
                System.out.print(j + " ");
            }
        }

        System.out.println("\n\nЗавдання 4: Факторіал числа 10");
        int fact = 1;
        for (int j = 1; j <= 10; j++) {
            fact *= j;
        }
        System.out.println("For loop: " + fact);

        fact = 1;
        int j = 1;
        while (j <= 10) {
            fact *= j;
            j++;
        }
        System.out.println("While loop: " + fact);

        System.out.println("\nЗавдання 5: Симетричні комбінації");
        int count = 0;
        for (int h = 0; h < 24; h++) {
            for (int m = 0; m < 60; m++) {
                if ((h / 10 == m % 10) && (h % 10 == m / 10)) {
                    System.out.printf("%02d:%02d\n", h, m);
                    count++;
                }
            }
        }
        System.out.println("Знайдено симетричних комбінацій: " + count);
    }
}
