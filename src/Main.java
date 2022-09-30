public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Task 1");
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Задача 2
        System.out.println("Task 2");
        int clientDeviceYear = 2014;
        if (clientDeviceYear >= 2015) {
            if (clientOS == 1) {
                System.out.println("Приложение будет работать корректно на вашей системе iOS");
            } else if (clientOS == 0) {
                System.out.println("Приложение будет работать корректно на вашей системе Android");
        }
        } else if (clientDeviceYear < 2015) {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию Android по ссылке");
            } else if (clientOS == 1) {
                System.out.println("Установите облегченную версию iOS по ссылке");
            }
        }

        //Задача 3
        System.out.println("Task 3");
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " является високосным");
        } else {
            System.out.println(year + " не является високосным");
        }

        //Задача 4
        System.out.println("Task 4");
        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays ++;
        }
        if (deliveryDistance > 60) {
            deliveryDays ++;
        }
        System.out.println("Потребуется дней: " + deliveryDays);

        //Задача 5
        System.out.println("Task 5");
        int monthNumber = 8;

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
                System.out.println("Некорректный месяц!");
        }
    }
}