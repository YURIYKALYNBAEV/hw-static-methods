import java.time.LocalDate;

public class Main {

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

    public static void calculateDelivery(int distance) {
        int deliveryTime = 1;

        if (distance <= 20) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (distance > 20 && distance <= 60) {
            deliveryTime += 1;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (distance > 60 && distance <= 100) {
            deliveryTime += 2;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (distance > 100) {
            System.out.println("Свыше 100 км доставки нет!");
        }
    }

    public static void main(String[] args) {

        // Задача №1
        System.out.println("Задача №1");
        int year = 2021;
        checkYear(year);
        // Задача №2
        System.out.println("Задача №2");
        byte clientOS = 1;
        int yearOfRelease = 2021;
        checkOSAndYear(clientOS, yearOfRelease);
        // Задача №3
        System.out.println("Задача №3");
        int deliveryDistance = 95;
        calculateDelivery(deliveryDistance);

    }
}