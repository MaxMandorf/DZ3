public class Main {
    public static void main(String[] args) {
        //Quest 1
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        //Quest 2
        int clientDeviceYear = 2016;
        if (clientOS == 1) {
            if (clientDeviceYear > 2015) {
                System.out.println("Установите приложение для Android");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            if (clientDeviceYear > 2015) {
                System.out.println("Установите приложение для IOS");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }
        //Quest 3
        int year = 2021;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "год является високосным");
        } else {
            System.out.println(year + "год не является високосным");
        }
        //Quest 4
        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней " + (deliveryDays + 1));
        } else if (deliveryDistance > 60) {
            System.out.println("Потребуется дней " + (deliveryDays + 2));
        }
        //Quest 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }

    }
}