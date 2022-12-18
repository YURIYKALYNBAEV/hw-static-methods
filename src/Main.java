import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        // Задача №1
        System.out.println("Задача №1");
        int year = 2021;
        checkYear(year);
        System.out.println();
    }

    public static void task2() {
        // Задача №2
        System.out.println("Задача №2");
        byte clientOS = 1;
        int yearOfRelease = 2021;
        checkOSAndYear(clientOS, yearOfRelease);
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача №3");
        int deliveryDistance = 95;
        int totalDeliveryDays = deliveryDays(deliveryDistance);
        printTotalDeliveryDays(totalDeliveryDays);
        System.out.println();
    }

    public static void checkYear(int controlYear) {
        if (controlYear % 4 != 0 || controlYear % 100 == 0 && controlYear % 400 != 0) {
            System.out.println(controlYear + " год не является високосным");
        } else {
            System.out.println(controlYear + " год является високосным");
        }
    }

    public static void checkOSAndYear(byte typeOS, int yearOfProduction) {
        int currentYear = LocalDate.now().getYear();

        if (typeOS == 0) {
            if (yearOfProduction < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите обычную версию приложения для iOS по ссылке");
            }
        } else if (typeOS == 1) {
            if (yearOfProduction < currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите обычную версию приложения для Android по ссылке");
            }
        } else {
            System.out.println("Ваша ОС не определена!");
        }
    }

    public static int deliveryDays(int distance) {
        int deliveryDays = 1;

        if (distance <= 20) {
            return deliveryDays;
        } else if (distance <= 60) {
            deliveryDays += 1;
            return deliveryDays;
        } else if (distance <= 100) {
            deliveryDays += 2;
            return deliveryDays;
        } else {
            return 0;
        }
    }

    public static void printTotalDeliveryDays(int totalDays) {
        if (totalDays == 0) {
            System.out.println("Свыше 100 км доставки нет!");
        } else {
            System.out.println("Потребуется дней: " + totalDays);
        }
    }
}