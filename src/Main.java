import java.time.LocalDate;

public class Main {
    //Задание 1 метод вычисления является ли год високосным
    public static void leapYear(int year) {
        System.out.println(String.format("%s год - %sвисокосный год", year, ((year > 1584) && (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) ? "" : "не"));
    }

    //Задание 2 метод определения версии приложения банка
    public static void bankAppVersion(int OS, int yearOfProduction) {
        int currentYear = LocalDate.now().getYear();
        System.out.println(String.format("Установите %s версию приложения для %s по ссылке", (yearOfProduction < currentYear ? "облегченную" : "обычную"), (OS == 0 ? "IOS" : "Android")));
    }

    //Задание 3 метод расчета дней доставки
    public static void deliveryCalculation(int distance) {
        if (distance <= 20) {
            System.out.printf("Потребуется дней: 1\n");
        } else if (distance > 20 && distance <= 60) {
            System.out.printf("Потребуется дней: 2\n");
        } else if (distance > 60 && distance <= 100) {
            System.out.printf("Потребуется дней: 3\n");
        } else System.out.printf("Доставки нет\n");
    }

    public static void main(String[] args) {
        int year = 1963;
        leapYear(year);
        int deviceOS = 1;
        int productionDeviceYear = 2023;
        bankAppVersion(deviceOS, productionDeviceYear);
        int deliveryDistance = 95;
        deliveryCalculation(deliveryDistance);
    }
}